package com.santander.connector.service.impl;

import java.io.IOException;

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
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.santander.connector.client.GqsClient;
import com.santander.connector.schema.InputParams;
import com.santander.connector.schema.ProductsResponse;
import com.santander.connector.schema.QuotingScheme;
import com.santander.connector.service.GqsApplicationApi;
import com.santander.gqs.client.GetProdutcs;
import com.santander.gqs.client.GetProdutcsResponse;
import com.santander.gqs.client.ObjectFactory;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

@Controller
public class GqsApplicationApiImpl implements GqsApplicationApi {

	private static final Logger log = LoggerFactory.getLogger(GqsApplicationApiImpl.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	
	@Autowired 
	GqsClient gqsClient;

	@org.springframework.beans.factory.annotation.Autowired
	public GqsApplicationApiImpl(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<QuotingScheme> getSimulation(
			@ApiParam(value = "The server response", required = true, defaultValue = "application/json") @RequestHeader(value = "Accept", required = true) String accept,
			@ApiParam(value = "metadata content type", required = true, defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@NotNull @ApiParam(value = "Password", required = true) @Valid @RequestParam(value = "Password", required = true) String password,
			@NotNull @ApiParam(value = "User", required = true) @Valid @RequestParam(value = "User", required = true) String user,
			@ApiParam(value = "ES, UK, CH", required = true) @PathVariable("country") String country,
			@NotNull @ApiParam(value = "XMLDataCalculate", required = true) @Valid @RequestParam(value = "XMLDataCalculate", required = true) String xmLDataCalculate,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID. The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId) {

		if (request.getHeader("Accept") != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<QuotingScheme>(objectMapper.readValue(
						"{  \"XmlData\" : \"XmlData\",  \"TotalTable\" : {    \"InsuranceEmploymentAmount\" : \"InsuranceEmploymentAmount\",    \"FeesAmount\" : \"FeesAmount\",    \"InsuranceAmount\" : \"InsuranceAmount\",    \"InsuranceLifeAmount\" : \"InsuranceLifeAmount\",    \"FeesPercentage\" : \"FeesPercentage\",    \"InsuranceDamageAmount\" : \"InsuranceDamageAmount\"  },  \"QuoteTable\" : [ {    \"APR\" : \"APR\",    \"InsuranceAmount\" : \"InsuranceAmount\",    \"QuoteID\" : \"QuoteID\",    \"MonthQuote\" : \"MonthQuote\",    \"IRR\" : \"IRR\",    \"MonthInterest\" : \"MonthInterest\",    \"Capital\" : \"Capital\",    \"IRR2\" : \"IRR2\"  }, {    \"APR\" : \"APR\",    \"InsuranceAmount\" : \"InsuranceAmount\",    \"QuoteID\" : \"QuoteID\",    \"MonthQuote\" : \"MonthQuote\",    \"IRR\" : \"IRR\",    \"MonthInterest\" : \"MonthInterest\",    \"Capital\" : \"Capital\",    \"IRR2\" : \"IRR2\"  } ],  \"SummaryTable\" : [ {    \"NumItems\" : \"NumItems\",    \"Amount\" : \"Amount\"  }, {    \"NumItems\" : \"NumItems\",    \"Amount\" : \"Amount\"  } ],  \"text_format\" : [ {    \"size\" : \"size\",    \"underline\" : \"underline\",    \"bold\" : \"bold\"  }, {    \"size\" : \"size\",    \"underline\" : \"underline\",    \"bold\" : \"bold\"  } ]}",
						QuotingScheme.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<QuotingScheme>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<QuotingScheme>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<ProductsResponse> requestProducts(
			@ApiParam(value = "The server response", required = true, defaultValue = "application/json") @RequestHeader(value = "Accept", required = true) String accept,
			@ApiParam(value = "metadata content type", required = true, defaultValue = "application/json") @RequestHeader(value = "Content-Type", required = true) String contentType,
			@ApiParam(value = "Client Id header", required = true) @RequestHeader(value = "X-Santander-Client-Id", required = true) String xSantanderClientId,
			@ApiParam(value = "ES, UK, CH", required = true) @PathVariable("country") String country,
			@ApiParam(value = "input Data", required = true) @Valid @RequestBody InputParams inputParams,
			@NotNull @ApiParam(value = "BusinessUnit", required = true) @Valid @RequestParam(value = "BusinessUnit", required = true) String businessUnit,
			@NotNull @ApiParam(value = "Version", required = true) @Valid @RequestParam(value = "Version", required = true) String version,
			@ApiParam(value = "Position of the parent operation in the trace tree. The value is 64 bits long. value is omitted when the span is the root of the trace tree. ") @RequestHeader(value = "X-B3-ParentSpanId", required = false) String xB3ParentSpanId,
			@ApiParam(value = "Sampling decision. Sampling is a mechanism to reduce the volume of data in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value must be consistently sent downstream. This means that either all or no spans share a trace ID. The possible values are 0 = Deny 1 = Accept d = Debug") @RequestHeader(value = "X-B3-Sampled", required = false) String xB3Sampled,
			@ApiParam(value = "Position of the current operation in the trace tree. The value is 64 bits long. Do not integererpret the value it may or may not be derived from the value of the TraceId.") @RequestHeader(value = "X-B3-SpanId", required = false) String xB3SpanId,
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId) {

		if (request.getHeader("Accept") != null && accept.contains("application/json")) {
			try {
				ObjectFactory objGqsFactory = new ObjectFactory();
				GetProdutcs getProductsRequest = objGqsFactory.createGetProdutcs();
				getProductsRequest.setBusinessUnit(businessUnit);
            	getProductsRequest.setVersion(version);
            	XmlMapper xmlMapper = new XmlMapper();
            	String inputParamsXml = xmlMapper.writeValueAsString(inputParams);
            	getProductsRequest.setXMLData(inputParamsXml);
            	GetProdutcsResponse wsResponse = gqsClient.getProductsResponse(getProductsRequest);
            	JsonNode node = xmlMapper.readTree(wsResponse.getGetProdutcsResult());
            	objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
            	ProductsResponse response = objectMapper.readValue(node.toPrettyString(), ProductsResponse.class);
            	return new ResponseEntity<ProductsResponse> (response,HttpStatus.OK);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProductsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<ProductsResponse>(HttpStatus.NOT_IMPLEMENTED);
	}
	
	public <T> T getJsonFormatResponse(String result, ObjectMapper objectMapper, Class<T> response)
			throws JsonProcessingException, JsonMappingException {
		XmlMapper xmlMapper = new XmlMapper();

//		objectMapper.coercionConfigFor(LogicalType.POJO)
//		  .setCoercion(CoercionInputShape.EmptyString, CoercionAction.AsEmpty);
////		String content = readFile(fileName, StandardCharsets.UTF_8);
//		String content = readFile("JSONResponse1649181634375", StandardCharsets.UTF_8);
		
		return (T) objectMapper.readValue(result,response);
	}

}
