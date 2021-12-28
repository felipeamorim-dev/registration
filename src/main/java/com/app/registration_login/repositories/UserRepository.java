package com.app.registration_login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.registration_login.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
