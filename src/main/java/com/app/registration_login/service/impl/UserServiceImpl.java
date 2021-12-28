package com.app.registration_login.service.impl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.app.registration_login.model.Role;
import com.app.registration_login.model.User;
import com.app.registration_login.repositories.UserRepository;
import com.app.registration_login.service.UserService;
import com.app.registration_login.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), 
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}
	
}
