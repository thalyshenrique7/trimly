package org.devthalys.trimly.controller;

import org.devthalys.trimly.entity.User;
import org.devthalys.trimly.service.UserService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path(value = "/api/user")
public class UserController {

	@Inject
	private UserService userService;

	@GET
	@Path(value = "/{id}")
	public User findById(@PathParam("id") Long id) {
		return this.userService.getById(id);
	}

	@Transactional
	@POST
	public void save(User user) {
		this.userService.create(user);
	}
}
