package org.devthalys.trimly.mapper;

import org.devthalys.trimly.dto.EstablishmentDTO;
import org.devthalys.trimly.dto.EstablishmentDTODetails;
import org.devthalys.trimly.entity.Establishment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface EstablishmentMapper {

	Establishment toEntity(EstablishmentDTO dto);

	EstablishmentDTODetails toDTODetails(Establishment entity);
}
