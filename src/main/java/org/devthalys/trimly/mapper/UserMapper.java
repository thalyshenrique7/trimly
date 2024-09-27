package org.devthalys.trimly.mapper;

import org.devthalys.trimly.dto.UserDTO;
import org.devthalys.trimly.dto.UserDTODetails;
import org.devthalys.trimly.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface UserMapper {

	User toEntity(UserDTO dto);

	UserDTODetails toDTODetails(User entity);
}
