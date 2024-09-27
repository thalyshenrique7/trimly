package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.UserDTO;
import org.devthalys.trimly.dto.UserDTODetails;
import org.devthalys.trimly.entity.User;
import org.devthalys.trimly.mapper.UserMapper;
import org.devthalys.trimly.repository.UserRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserServiceImpl implements UserService {

	@Inject
	private UserRepository userRepository;

	private final UserMapper userMapper;

	@Inject
	public UserServiceImpl(UserMapper userMapper) {
		super();
		this.userMapper = userMapper;
	}

	@Override
	public void create(UserDTO userDTO) {

		User user = this.userMapper.toEntity(userDTO);

		this.userRepository.persist(user);
	}

	@Override
	public UserDTODetails getById(Long userId) {

		User user = this.userRepository.findById(userId);

		UserDTODetails dto = this.userMapper.toDTODetails(user);

		return dto;
	}

}
