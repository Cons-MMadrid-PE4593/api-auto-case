package com.santander.connector.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.santander.connector.schema.InputParams;
import com.santander.connector.schema.ProductsResponse;
import com.santander.connector.schema.QuotingScheme;
import com.santander.connector.schema.ResponseError;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

@Api(value = "gqsApplication", tags = { "gqs-calculate" })
public interface GqsApplicationApi {

	@ApiOperation(value = "Calculate one quote", nickname = "getSimulation", notes = "Get example loan cuotes for dealer", response = QuotingScheme.class, authorizations = {
			@Authorization(value = "JWTProfile", scopes = {
					@AuthorizationScope(scope = "sce", description = "sce") }) })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "200 OK", response = QuotingScheme.class),
			@ApiResponse(code = 201, message = "Created"),
			@ApiResponse(code = 400, message = "Bad Request", response = ResponseError.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Error Server") })
	@RequestMapping(value = "/gqsApplication/calculator/{country}/v1/calculate", produces = {
			"application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<QuotingScheme> getSimulation(
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
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId);

	@ApiOperation(value = "Get products", nickname = "requestProducts", notes = "GQS Products information", response = ProductsResponse.class, authorizations = {
			@Authorization(value = "JWTProfile", scopes = {
					@AuthorizationScope(scope = "sce", description = "sce") }) })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "200 OK", response = ProductsResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = ResponseError.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Internal Error Server") })
	@RequestMapping(value = "/gqsApplication/calculator/{country}/v1/products", produces = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<ProductsResponse> requestProducts(
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
			@ApiParam(value = "Overall ID of the trace, shared by every span in the trace. The value is 64 or 128 bits long.") @RequestHeader(value = "X-B3-TraceId", required = false) String xB3TraceId);

}
