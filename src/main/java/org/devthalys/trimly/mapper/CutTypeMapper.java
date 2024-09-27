package org.devthalys.trimly.mapper;

import org.devthalys.trimly.dto.CutTypeDTO;
import org.devthalys.trimly.dto.CutTypeDTODetails;
import org.devthalys.trimly.entity.CutType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface CutTypeMapper {

	CutType toEntity(CutTypeDTO dto);

	CutTypeDTODetails toDTODetails(CutType entity);
}
