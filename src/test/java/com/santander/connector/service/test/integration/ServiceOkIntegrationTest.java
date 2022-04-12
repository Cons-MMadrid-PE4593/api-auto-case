package com.santander.connector.service.test.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.santander.connector.service.impl.GqsApplicationApiImpl;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("junit")
class ServiceOkIntegrationTest{
	
	@Autowired
	GqsApplicationApiImpl gqsApiImpl;

	@DisplayName("Test service impl is running OK")

	@Test
	void test() {
		Assertions.assertNotNull(gqsApiImpl);
	}
}
