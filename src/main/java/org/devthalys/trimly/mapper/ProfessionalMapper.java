package org.devthalys.trimly.mapper;

import org.devthalys.trimly.dto.ProfessionalDTO;
import org.devthalys.trimly.dto.ProfessionalDTODetails;
import org.devthalys.trimly.entity.Professional;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "jakarta")
public interface ProfessionalMapper {

	@Mapping(target = "establishment.id", source = "establishmentId")
	Professional toEntity(ProfessionalDTO dto);

	@Mapping(target = "establishmentId", source = "establishment.id")
	ProfessionalDTODetails toDTODetails(Professional entity);
}
