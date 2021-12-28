package com.app.registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.app.registration.model.User;
import com.app.registration.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
