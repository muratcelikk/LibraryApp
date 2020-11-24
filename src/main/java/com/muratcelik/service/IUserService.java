package com.muratcelik.service;

import com.muratcelik.entity.User;
import com.muratcelik.support.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}