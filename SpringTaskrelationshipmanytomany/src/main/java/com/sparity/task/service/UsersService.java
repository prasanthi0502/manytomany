package com.sparity.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparity.task.entity.Users;
import com.sparity.task.repository.UsersRepository;
@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepository;

	public Users addUser(Users users) {
		
		return usersRepository.save(users);
	}


}
