package com.example.city.service.impl;

import com.example.city.domain.AppUser;
import com.example.city.repository.UserRepository;
import com.example.city.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AppUser save(AppUser user) {
        return userRepository.save(user);
    }


}
