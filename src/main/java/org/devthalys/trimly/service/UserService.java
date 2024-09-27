package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.UserDTO;
import org.devthalys.trimly.dto.UserDTODetails;

public interface UserService {

	void create(UserDTO userDTO);

	UserDTODetails getById(Long userId);
}
