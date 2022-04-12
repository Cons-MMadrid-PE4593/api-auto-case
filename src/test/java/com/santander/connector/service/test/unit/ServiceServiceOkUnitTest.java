package com.santander.connector.service.test.unit;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santander.connector.schema.ProductsResponse;
import com.santander.connector.schema.QuotingScheme;
import com.santander.connector.service.impl.GqsApplicationApiImpl;

@WebMvcTest(controllers = GqsApplicationApiImpl.class)
@ActiveProfiles("junit")
class ServiceServiceOkUnitTest {

	private ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}

	@Test
	public void getProductTest() {
		String urlTemplate = "/gqsApplication/calculator/ES/v1/products?Version=1";
		String strJsonInputParams = "{\"DealerCode\":\"183735\", \"User\":\"NWA\", \"Password\":\"NWA_GEN_PRE\", \"CapCode\":\"\", \"VIN\":\"WW1111AFRJ222222\", \"LicensePlate\":\"0489KML\"}";
		RequestBuilder reqBuilder = MockMvcRequestBuilders.post(urlTemplate).accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON).header("X-Santander-Client-Id", "123456")
				.content(strJsonInputParams);
		try {
			MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isOk()).andReturn();
			objectMapper = new ObjectMapper();
			ProductsResponse response = objectMapper.readValue(result.getResponse().getContentAsString(),
					ProductsResponse.class);
			assertTrue(response.getFinanceProduct().getProduct().get(0) != null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getSimulationTest() {
		String urlTemplate = "/gqsApplication/calculator/ES/v1/calculate?Password=jcm&User=jcm";
		String strJsonGqsParams = "{\"Dealer\":\"183735\",\"Product\":\"ES2341\",\"RetailPrice\":\"57000\",\"DownPayment\":\"5000\",\"DeliveredItemValue\":\"0\",\"OtherLoansAmount\":\"0\",\"Balloon\":\"0\",\"Period\":\"24\",\"Instalment\":\"0\",\"InterestRate\":\"3.25\",\"DeferredPeriod\":\"0\",\"Mileage\":\"0\",\"InsurancePrime\":\"0\",\"FirstInstalmentDate\":\"02/05/2022\",\"InterestDate\":\"31/03/2022\",\"FeeType\":\"F\",\"AssetsCode\":\"\",\"Insurances\":\"\"}";
		RequestBuilder reqBuilder = MockMvcRequestBuilders.post(urlTemplate).accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON).header("X-Santander-Client-Id", "123456")
				.content(strJsonGqsParams);
		try {
			MvcResult result = mockMvc.perform(reqBuilder).andExpect(status().isOk()).andReturn();
			objectMapper = new ObjectMapper();
			QuotingScheme response = objectMapper.readValue(result.getResponse().getContentAsString(),
					QuotingScheme.class);
			assertTrue(response.getQuoteTable().get(0) != null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
