package com.santander.connector.model.dto;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO returned by this API
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "OutputService", description = "OutputService data")
@Getter
@Setter
@ToString
public class OutputServiceDTO{
	
	//TODO: add fields
	
}