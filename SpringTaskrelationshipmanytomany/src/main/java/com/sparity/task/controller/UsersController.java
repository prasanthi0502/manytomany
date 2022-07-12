package com.sparity.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.sparity.task.entity.Users;
import com.sparity.task.service.UsersService;

@RestController

public class UsersController {
	@Autowired

	private UsersService usersService;

	@PostMapping("/users")
	public Users add(@RequestBody Users users) {
		
		return usersService.addUser(users);
	}
}
//updated