package com.santander.connector.config.httpclient;

import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.santander.connector.handler.httpclient.ServiceClientErrorHandler;
import com.santander.connector.handler.httpclient.ServiceClientHttpRequestInterceptor;

/**
 * RestTemplate configuration.
 *
 */
//@Configuration
public class RestTemplateConfig {

	private final CloseableHttpClient httpClient;
	
	/**
	 * Constructor.
	 * @param httpClient httpClient
	 */
	public RestTemplateConfig(@Autowired @Qualifier("httpClient") CloseableHttpClient httpClient) {
	    this.httpClient = httpClient;
	}

	/**
	 * Creates HttpRequest factory
	 * @return HttpComponentsClientHttpRequestFactory
	 */

	@Qualifier("clientHttpRequestFactory")
	public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
	    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
	    clientHttpRequestFactory.setHttpClient(httpClient);
	    return clientHttpRequestFactory;
	}

	/**
	 * Create a new RestTemplate
	 * @param restTemplateBuilder RestTemplateBuilder
	 * @return RestTemplate
	 */
	@Bean
	@Qualifier("restTemplate")
	public RestTemplate restTemplate(@Autowired RestTemplateBuilder restTemplateBuilder) {
	  return restTemplateBuilder.requestFactory(this::clientHttpRequestFactory)
	            .errorHandler(new ServiceClientErrorHandler())
	            .interceptors(new ServiceClientHttpRequestInterceptor())
	            .build();
	}
}
