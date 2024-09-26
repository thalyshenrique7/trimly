package org.devthalys.trimly.service;

import org.devthalys.trimly.entity.User;

public interface UserService {

	void create(User user);

	User getById(Long userId);
}
