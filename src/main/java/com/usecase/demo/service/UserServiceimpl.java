package com.usecase.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.demo.dao.UserRepository;
import com.usecase.entity.model.User;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto getUserById(String userId) {
		return UserServiceimpl.entityToDto(userRepository.findById(userId));
	}
	
	public static UserDto entityToDto(Optional<User> optional) {
		UserDto userDto = new UserDto(optional.get().getUser_id(), optional.get().getFirst_name(), optional.get().getId());
		return userDto;
	}

}
