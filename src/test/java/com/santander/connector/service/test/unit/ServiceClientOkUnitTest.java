package com.santander.connector.service.test.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.connector.service.test.utils.UtilsTest;

@SpringBootTest
@ActiveProfiles("junit")
class ServiceClientOkUnitTest {
	
	private ExecutionContext context;

	@BeforeEach
	void init() {
		context = UtilsTest.getMockExecutionContext();
	}

	
	@DisplayName("Test client 200")
	@Test
	void should_response200_when_call_client() {


	}

}
