package com.santander.connector.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;

@Validated
@Service
@Api (value = "Dummy Case", tags = {"dummy"})
public interface DummyCaseApi {

	@RequestMapping (value = "/example/dummy", method = RequestMethod.GET) 
	ResponseEntity<String> dummyMethod();
}
