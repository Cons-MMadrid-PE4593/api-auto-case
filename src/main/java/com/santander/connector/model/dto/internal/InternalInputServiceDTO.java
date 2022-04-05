package com.santander.connector.model.dto.internal;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO to be sent to the internal endpoint.
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(value = "InternalInputService", description = "InternalInputService data")
@Getter
@Setter
@ToString
public class InternalInputServiceDTO{

	// TODO: add fields
	
}