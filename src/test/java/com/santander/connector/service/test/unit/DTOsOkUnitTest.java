package com.santander.connector.service.test.unit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;

import com.santander.ademma.common.model.dto.ResponseDTO;
import com.santander.ademma.common.model.dto.context.ExecutionContext;
import com.santander.ademma.common.model.dto.error.ListRestError;
import com.santander.ademma.common.model.dto.error.RestError;
import com.santander.ademma.common.utils.error.ErrorUtils;
import com.santander.connector.model.dto.InputServiceDTO;
import com.santander.connector.model.dto.OutputServiceDTO;
import com.santander.connector.model.dto.internal.InternalInputServiceDTO;
import com.santander.connector.model.dto.internal.InternalOutputServiceDTO;
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
		
		InputServiceDTO inputServiceDTO = new InputServiceDTO();
		OutputServiceDTO outputServiceDTO = new OutputServiceDTO();
		InternalInputServiceDTO internalInputServiceDTO = new InternalInputServiceDTO();
		InternalOutputServiceDTO internalOutputServiceDTO = new InternalOutputServiceDTO();
		ResponseDTO responseDTO = new ResponseDTO();
		RestError restError = new RestError();
		ListRestError listRestError = new ListRestError();
		
		assertAll(
				() -> assertNotNull(context.toString()),
				() -> assertNotNull(inputServiceDTO.toString()),
				() -> assertNotNull(outputServiceDTO.toString()),				
				() -> assertNotNull(internalOutputServiceDTO.toString()),
				() -> assertNotNull(internalInputServiceDTO.toString()),
				() -> assertNotNull(responseDTO.toString()),
				() -> assertNotNull(restError.toString()),
				() -> assertNotNull(listRestError.toString())
		);
					
	}
	
	
	
}
