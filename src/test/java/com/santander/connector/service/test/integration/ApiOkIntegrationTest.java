package com.santander.connector.service.test.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@WebMvcTest
public class ApiOkIntegrationTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@BeforeEach
	public void setup() {
	    this.mockMvc = MockMvcBuilders
	      .webAppContextSetup(this.context)
	      .build();
	}
	@Test
    public void swaggerApiDosRunningTest() throws Exception {
		String urlTemplate="/api-docs";
    	RequestBuilder reqBuilder = MockMvcRequestBuilders.get(urlTemplate);
    	MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isOk()).andReturn();
    	assertEquals(200, result.getResponse().getStatus());
    }

}
