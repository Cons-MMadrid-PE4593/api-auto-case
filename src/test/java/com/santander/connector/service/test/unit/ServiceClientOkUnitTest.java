package com.santander.connector.service.test.unit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.connector.client.ServiceClient;
import com.santander.connector.service.test.utils.UtilsTest;

@SpringBootTest
@ActiveProfiles("junit")
class ServiceClientOkUnitTest {

	@Autowired 
	private ServiceClient client;

	@MockBean
	private RestTemplate restTemplate;
	
	
	private ExecutionContext context;

	@BeforeEach
	void init() {
		context = UtilsTest.getMockExecutionContext();
	}

	
	@DisplayName("Test client 200")
	@Test
	void should_response200_when_call_client() {
		when(restTemplate.exchange(any(RequestEntity.class), any(Class.class)))
		.thenReturn(UtilsTest.getMockResponseClient(HttpStatus.OK));

	}
	


}
