package com.aixigo.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aixigo.example.entity.User;


@RestController
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/user")
	List<User> getAllUsers() {
		logger.info("Get all users");
		List<User> users = new ArrayList<>();
		User user = new User(1L, "Clyde");
		users.add(user);
		return users;
	}
	
}
