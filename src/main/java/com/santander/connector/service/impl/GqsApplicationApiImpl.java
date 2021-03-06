package com.santander.connector.service.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.santander.connector.client.GqsClient;
import com.santander.connector.handler.ResponseError;
import com.santander.connector.schema.GQSSchema;
import com.santander.connector.schema.InputParams;
import com.santander.connector.schema.ProductsResponse;
import com.santander.connector.schema.QuotingScheme;
import com.santander.connector.schema.TextFormat;
import com.santander.connector.service.GqsApplicationApi;
import com.santander.connector.utils.HtmlUtil;
import com.santander.gqs.client.Calculate;
import com.santander.gqs.client.CalculateResponse;
import com.santander.gqs.client.GetProdutcs;
import com.santander.gqs.client.GetProdutcsResponse;
import com.santander.gqs.client.ObjectFactory;

import io.swagger.annotations.ApiParam;

@Controller
public class GqsApplicationApiImpl implements GqsApplicationApi {

	private static final Logger log = LoggerFactory.getLogger(GqsApplicationApiImpl.class);

	private final ObjectMapper objectMapper;
	private final HttpServletRequest request;
	private ObjectFactory objectGqsFactory;
	private XmlMapper xmlGQSMapper;

	@Autowired
	GqsClient gqsClient;

	@org.springframework.beans.factory.annotation.Autowired
	public GqsApplicationApiImpl(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.objectGqsFactory = new ObjectFactory();
		this.xmlGQSMapper = new XmlMapper();
	}

	public ResponseEntity<QuotingScheme> getSimulation(
			@ApiParam(value = "The server response", required = true, defaultValue = "application/json") @RequestHeader(value = "Accept", required = true) String accept,
			@ApiParam(value = "metadata content type", required = true, defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@NotNull @ApiParam(value = "API???s credentials to be provided by SCF", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@NotNull @ApiParam(value = "API???s credentials to be provided by SCF", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@ApiParam(value = "GQS data", required = true) @Valid @RequestBody GQSSchema GQSData,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID. The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId) throws IOException {

		if (request.getHeader("Accept") != null && request.getHeader("Accept").contains("application/json")) {
			try {

				Calculate calculateReq = objectGqsFactory.createCalculate();
				calculateReq.setUser(user);
				calculateReq.setPassword(password);
				String gqsXml = xmlGQSMapper.writeValueAsString(GQSData);
				calculateReq.setXMLData(gqsXml);

				CalculateResponse calculateResp = gqsClient.getCalculateResponse(calculateReq);
				String result = calculateResp.getCalculateResult();
				QuotingScheme auxQuotingScheme = getJsonFormatResponse(result, objectMapper, QuotingScheme.class);
				List<TextFormat> auxTextFormatList=auxQuotingScheme.getTextFormat();
				auxQuotingScheme.setHtmlText(HtmlUtil.getCalculateFinanceTextConditions(auxTextFormatList));
				return new ResponseEntity<QuotingScheme>(auxQuotingScheme, HttpStatus.OK);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<QuotingScheme>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		else {
			throw new IOException(ResponseError.StatusEnum._406_NOT_ACCEPTABLE.toString());
		}

//		return new ResponseEntity<QuotingScheme>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<ProductsResponse> requestProducts(
			@ApiParam(value = "The server response", required = true, defaultValue = "application/json") @RequestHeader(value = "Accept", required = true) String accept,
			@ApiParam(value = "metadata content type", required = true, defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@NotNull @ApiParam(value = "API???s credentials to be provided by SCF", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@NotNull @ApiParam(value = "API???s credentials to be provided by SCF", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@NotNull @ApiParam(value = "Dealer???s affiliation code to identify the vehicle owner. Defined by SCF. Mandatory in Groups or Brands that manage the sale of several prescribers/dealers", required = true) @Valid @RequestParam(value = "DealerCode", required = true) String dealerCode,
			@ApiParam(value = "Vehicle code (eurotax, jato or IdDerivative, as agreed with SCF). correspond to a specific brand, model and version of a vehicle. Optional parameter to be used as a filter.") @Valid @RequestParam(value = "CapCode", required = false) String capCode,
			@ApiParam(value = "Vehicle identification number (VIN), also called a chassis number or frame number. Optional parameter to be used as a filter.") @Valid @RequestParam(value = "Vin", required = false) String vin,
			@ApiParam(value = "Vehicle registration plate. Optional parameter to be used as a filter.") @Valid @RequestParam(value = "LicensePlate", required = false) String licensePlate,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID. The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId) throws IOException {

		if (request.getHeader("Accept") != null && request.getHeader("Accept").contains("application/json")) {
			try {

				GetProdutcs getProductsRequest = objectGqsFactory.createGetProdutcs();
				getProductsRequest.setBusinessUnit("ES");
				getProductsRequest.setVersion("1");
				InputParams inputParams = new InputParams();
				inputParams.setDealerCode(dealerCode);
				inputParams.setUser(user);
				inputParams.setPassword(password);
				inputParams.setCapCode(capCode);
				inputParams.setVIN(vin);
				inputParams.setLicensePlate(licensePlate);
				String inputParamsXml = xmlGQSMapper.writeValueAsString(inputParams);
				getProductsRequest.setXMLData(inputParamsXml);

				GetProdutcsResponse wsResponse = gqsClient.getProductsResponse(getProductsRequest);
				String result = wsResponse.getGetProdutcsResult();

				return new ResponseEntity<ProductsResponse>(
						getJsonFormatResponse(result, objectMapper, ProductsResponse.class), HttpStatus.OK);
			} catch (Exception e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProductsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		else {
			throw new IOException(ResponseError.StatusEnum._406_NOT_ACCEPTABLE.toString());
		}

//		return new ResponseEntity<ProductsResponse>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	public <T> T getJsonFormatResponse(String result, ObjectMapper objectMapper, Class<T> response)
			throws JsonProcessingException, JsonMappingException {
		JsonNode node = xmlGQSMapper.readTree(result);
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
    	objectMapper.coercionConfigFor(LogicalType.POJO)
		  		.setCoercion(CoercionInputShape.EmptyString, CoercionAction.AsEmpty);
		return objectMapper.readValue(objectMapper.writeValueAsString(node), response);
	}

}
