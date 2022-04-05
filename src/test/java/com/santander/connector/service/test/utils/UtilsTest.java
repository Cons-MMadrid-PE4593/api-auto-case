package com.santander.connector.service.test.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.santander.ademma.common.utils.CommonConstants;
import com.santander.ademma.common.exception.BadRequestException;
import com.santander.ademma.common.exception.CircuitBreakerException;
import com.santander.ademma.common.exception.RetryException;
import com.santander.ademma.common.utils.error.ErrorUtils;
import com.santander.ademma.common.utils.formatter.JsonUtils;
import com.santander.ademma.common.model.dto.error.LevelEnum;
import com.santander.ademma.common.model.dto.error.ListRestError;
import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.ademma.common.model.dto.context.Context;
import com.santander.connector.model.dto.InputServiceDTO;
import com.santander.connector.model.dto.OutputServiceDTO;
import com.santander.connector.model.dto.internal.InternalInputServiceDTO;
import com.santander.connector.model.dto.internal.InternalOutputServiceDTO;

public class UtilsTest {

	public static InputServiceDTO getMockInputServiceDTO() {
		InputServiceDTO service = new InputServiceDTO();
		// TODO: Add the necessary fields.
		return service;
	}

	public static InternalInputServiceDTO getMockInternalInputServiceDTO() {
		InternalInputServiceDTO service = new InternalInputServiceDTO();
		// TODO: Add the necessary fields.
		return service;
	}

	public static OutputServiceDTO getMockOutputServiceDTO() {
		OutputServiceDTO service = new OutputServiceDTO();
		// TODO: Add the necessary fields.
		return service;
	}

	public static InternalOutputServiceDTO getMockInternalOutputServiceDTO() {
		InternalOutputServiceDTO service = new InternalOutputServiceDTO();
		// TODO: Add the necessary fields.
		return service;
	}

	public static ExecutionContext getMockExecutionContext() {
		ExecutionContext context = new ExecutionContext();
		Context jsonContext = new Context();
		context.setContext(jsonContext);
		// TODO: Add the necessary fields.
		return context;
	}

	public static ListRestError getMockErrorDto(HttpStatus status, Exception exc) {
		return ListRestError.buildListError(status, LevelEnum.ERROR, exc.getMessage());
	}

	public static HttpHeaders getMockHeaders(ExecutionContext context) {
		HttpHeaders headers = new HttpHeaders();
		headers.add(CommonConstants.HEADER_AUTHORIZATION,context.getAuthorization());
		headers.add(CommonConstants.HEADER_CONTENT_TYPE,context.getContentType());
		headers.add(CommonConstants.HEADER_CONTEXT,JsonUtils.toString(context.getContext()));
		headers.add(CommonConstants.HEADER_ACCEPT,context.getAccept());
		headers.add(CommonConstants.HEADER_X_SANTANDER_CLIENT_ID,context.getClientId());
		headers.add(CommonConstants.HEADER_X_B3_PARENTSPANID,context.getXB3ParentSpanId());
		headers.add(CommonConstants.HEADER_X_B3_SAMPLED,context.getXB3Sampled());
		headers.add(CommonConstants.HEADER_X_B3_SPANID,context.getXB3SpanId());
		headers.add(CommonConstants.HEADER_X_B3_TRACEID,context.getXB3TraceId());
		return headers;
	}

	public static ResponseEntity<String> getMockResponseClient(HttpStatus status) {
		return new ResponseEntity<String>(JsonUtils.toString(getMockInternalOutputServiceDTO()), status);
	}

	public static ResponseEntity<String> getMockResponseClientError(HttpStatus status) {
		return new ResponseEntity<String>(
				JsonUtils.toString(getMockErrorDto(status, new Exception("Test rest error succeeded."))), status);
	}
	
	public static ResponseEntity<String> getMockResponseClientErrorRetryException(HttpStatus status) {
		return new ResponseEntity<String>(
				JsonUtils.toString(ErrorUtils.buildError(null,null,status, new RetryException("Retry exception"))), status);
	}
	
	public static ResponseEntity<String> getMockResponseClientErrorCircuitBreakerException(HttpStatus status) {
		return new ResponseEntity<String>(
				JsonUtils.toString(ErrorUtils.buildError(null,null,status, new CircuitBreakerException("Circuit breaker exception"))), status);
	}
	
	public static ResponseEntity<String> getMockResponseClientErrorBadRequestException(HttpStatus status) {
		return new ResponseEntity<String>(
				JsonUtils.toString(ErrorUtils.buildError(null,null,status, new BadRequestException("BadRequest exception"))), status);
	}

}