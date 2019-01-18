package com.usecase.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.demo.service.UserDto;
import com.usecase.demo.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/v1/getUser/{userId}")
	public UserDto getUserById(@PathVariable String userId) {
		return userService.getUserById(userId);
	}

}
