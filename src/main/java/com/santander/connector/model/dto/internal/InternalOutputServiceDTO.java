package com.santander.connector.model.dto.internal;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO obtained from internal endpoint.
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "InternalOutputService", description = "InternalOutputService data")
@Getter
@Setter
@ToString
public class InternalOutputServiceDTO{
	
	//TODO: add fields 
	
}