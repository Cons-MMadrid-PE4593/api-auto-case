package com.santander.connector.service.test.integration;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.ademma.common.utils.CommonConstants;
import com.santander.ademma.common.utils.formatter.JsonUtils;
import com.santander.connector.client.ServiceClient;
import com.santander.connector.service.test.utils.UtilsTest;
import com.santander.connector.utils.Constants;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("junit")
class ServiceOkIntegrationTest{

	@Autowired
	private MockMvc mockMvc;

	@MockBean 
	private ServiceClient client;

	@DisplayName("Test response when all succeeded")
	@Test
	void should_response_when_allSucceeded() throws Exception {





	}
}
