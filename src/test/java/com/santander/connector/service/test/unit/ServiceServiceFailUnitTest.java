package com.santander.connector.service.test.unit;


import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.santander.ademma.common.model.dto.context.ExecutionContext;
//import com.santander.connector.service.impl.ServiceServiceImpl;
import com.santander.connector.service.test.utils.UtilsTest;

@SpringBootTest
@ActiveProfiles("junit")
class ServiceServiceFailUnitTest {


	
	private ExecutionContext context;
	
	@BeforeEach
	void init() {
		context = UtilsTest.getMockExecutionContext();
	}

	





}
