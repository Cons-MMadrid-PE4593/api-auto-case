package com.santander.connector.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class GqsConfiguration{
	
	@Bean
	public GqsClient gqsClient(Jaxb2Marshaller marshallerGqs) {
		GqsClient gqsClient = new GqsClient();
		gqsClient.setDefaultUri("https://ficresfrontcert.scftest.santanderconsumer.es/GQS/GQS.asmx");
		gqsClient.setMarshaller(marshallerGqs);
		gqsClient.setUnmarshaller(marshallerGqs);
		return gqsClient;
	}
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
		properties.put(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.setMarshallerProperties(properties);
		marshaller.setContextPaths("com.santander.gqs.client");
		return marshaller;
	}

}
