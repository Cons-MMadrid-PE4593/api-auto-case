package com.santander.connector.mapper;

import org.springframework.stereotype.Component;

import com.santander.connector.model.dto.InputServiceDTO;
import com.santander.connector.model.dto.OutputServiceDTO;
import com.santander.connector.model.dto.internal.InternalInputServiceDTO;
import com.santander.connector.model.dto.internal.InternalOutputServiceDTO;


/**
 * Wrapper to be used to execute mapping actions.
 *
 */
@Component
public class ServiceMapperWrapper{

	/**
	 * Transforms InputServiceDTO to InternalInputServiceDTO
	 * @param input InputServiceDTO
	 * @return InternalInputServiceDTO
	 */
	public InternalInputServiceDTO inputServiceDTOToInternalInputServiceDTO(InputServiceDTO input) {
		
		InternalInputServiceDTO dto = ServiceMapper.getInstance().inputServiceDTOToInternalInputServiceDTO(input);
		//TODO: implement additional mappings here
		
		return dto;
	}
	
	/**
	 * Transforms InternalOutputServiceDTO to OutputServiceDTO
	 * @param output InternalOutputServiceDTO
	 * @return OutputServiceDTO
	 */
	public OutputServiceDTO internalOutputServiceDTOToOutputServiceDTO(InternalOutputServiceDTO output){
		
		OutputServiceDTO dto = ServiceMapper.getInstance().internalOutputServiceDTOToOutputServiceDTO(output);
		//TODO: implement additional mappings here
		
		return dto;
	}
	

}