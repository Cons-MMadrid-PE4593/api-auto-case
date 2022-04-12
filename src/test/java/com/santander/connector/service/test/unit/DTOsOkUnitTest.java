package com.santander.connector.service.test.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.connector.service.test.utils.UtilsTest;

@SpringBootTest
@ActiveProfiles("junit")
class DTOsOkUnitTest {

	private ExecutionContext context;

	@BeforeEach
	void init() {
		context = UtilsTest.getMockExecutionContext();
	}

	@DisplayName("Test toString beans")
	@Test
	void should_test_toString_beans() {

	}

}
