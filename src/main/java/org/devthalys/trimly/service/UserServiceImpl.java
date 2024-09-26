package org.devthalys.trimly.service;

import org.devthalys.trimly.entity.User;
import org.devthalys.trimly.repository.UserRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserServiceImpl implements UserService {

	@Inject
	private UserRepository userRepository;

	@Override
	public void create(User user) {

		this.userRepository.persist(user);

	}

	@Override
	public User getById(Long userId) {

		return this.userRepository.findById(userId);
	}

}
