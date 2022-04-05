package com.santander.connector.client.impl;

import io.github.resilience4j.retry.annotation.Retry;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import com.santander.ademma.common.exception.BadRequestException;
import com.santander.ademma.common.exception.RetryException;
import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.ademma.common.utils.CommonConstants;
import com.santander.ademma.common.utils.formatter.JsonUtils;
import com.santander.ademma.common.utils.logging.LoggingUtils;
import com.santander.ademma.common.utils.httpclient.HttpClientUtils;
import com.santander.connector.client.ServiceClient;
//import com.santander.connector.config.ServiceConfig;
import com.santander.connector.model.dto.internal.InternalInputServiceDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * Client which connect to the endpoint
 *
 */
@Component
@Slf4j
public class ServiceClientImpl implements ServiceClient {
	
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;
	
//	@Autowired
//	private ServiceConfig serviceConfig;

	private ResponseEntity<String> fallbackRetry(RuntimeException exc) {
		throw new RetryException(exc.getMessage());
	}
}
