package com.app.registration_login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.app.registration_login.model.User;
import com.app.registration_login.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);
}
