package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.User;

import com.dev.insurance_middle.application.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService  {

    private final UserRepository userRepository;

    public User findUserById(Long userId) {
        return userRepository.findById(userId);
    }

}
