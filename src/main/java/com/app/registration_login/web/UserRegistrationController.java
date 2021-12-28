package com.app.registration_login.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app.registration_login.service.impl.UserServiceImpl;
import com.app.registration_login.web.dto.UserRegistrationDto;

@Controller
public class UserRegistrationController {
	
	private UserServiceImpl userService;

	public UserRegistrationController(UserServiceImpl userService) {
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return null;
	}
}
