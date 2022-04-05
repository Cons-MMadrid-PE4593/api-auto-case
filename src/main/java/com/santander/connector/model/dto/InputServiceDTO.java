package com.santander.connector.model.dto;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO obtained from request.
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "InputService", description = "InputService data")
@Getter
@Setter
@ToString
public class InputServiceDTO{
	
	//TODO: add fields 
	
}