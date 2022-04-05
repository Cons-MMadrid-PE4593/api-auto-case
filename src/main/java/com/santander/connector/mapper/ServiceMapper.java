package com.santander.connector.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.santander.ademma.common.mapper.GenericMappingHelper;
import com.santander.connector.model.dto.InputServiceDTO;
import com.santander.connector.model.dto.OutputServiceDTO;
import com.santander.connector.model.dto.internal.InternalInputServiceDTO;
import com.santander.connector.model.dto.internal.InternalOutputServiceDTO;


/**
 * Map struct interface. It contains mapping configurations.
 */
@Mapper(uses = { ServiceMappingHelper.class, GenericMappingHelper.class })
public interface ServiceMapper {

	static ServiceMapper getInstance() {
		return Mappers.getMapper(ServiceMapper.class);
	}

	/**
	 * Transforms InputServiceDTO to InternalInputServiceDTO
	 * @param dto InputServiceDTO
	 * @return InternalInputServiceDTO
	 */
	//TODO: complete mappings
	//@Mapping(source = "xxx", target = "yyy")
	InternalInputServiceDTO inputServiceDTOToInternalInputServiceDTO(InputServiceDTO dto);

	/**
	 * Transforms InternalOutputServiceDTO to OutputServiceDTO
	 * @param dto InternalOutputServiceDTO
	 * @return OutputServiceDTO
	 */
	//TODO: complete mappings
	//@Mapping(source = "xxx", target = "yyy")
	OutputServiceDTO internalOutputServiceDTOToOutputServiceDTO(InternalOutputServiceDTO dto);


}