package com.app.registration_login.service;

import com.app.registration_login.model.User;
import com.app.registration_login.web.dto.UserRegistrationDto;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);
}
