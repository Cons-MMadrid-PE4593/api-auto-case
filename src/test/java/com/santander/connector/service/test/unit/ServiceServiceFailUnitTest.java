package com.santander.connector.service.test.unit;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;

import com.santander.ademma.common.model.dto.ResponseDTO;
import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.ademma.common.exception.MappingException;
import com.santander.connector.client.ServiceClient;
import com.santander.connector.mapper.ServiceMapperWrapper;
import com.santander.connector.model.dto.internal.InternalOutputServiceDTO;
//import com.santander.connector.service.impl.ServiceServiceImpl;
import com.santander.connector.service.test.utils.UtilsTest;

@SpringBootTest
@ActiveProfiles("junit")
class ServiceServiceFailUnitTest {

//	@Autowired 
//	private ServiceServiceImpl serviceImpl;

	@MockBean 
	private ServiceClient client;


	@MockBean 
	private ServiceMapperWrapper mockMapperWrapper;
	
	private ExecutionContext context;
	
	@BeforeEach
	void init() {
		context = UtilsTest.getMockExecutionContext();
	}

	





}
