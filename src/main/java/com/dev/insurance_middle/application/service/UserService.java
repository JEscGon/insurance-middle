package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.User;

import com.dev.insurance_middle.application.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findUserById(Long userId) {
        return userRepository.findById(userId);
    }
    public void deleteUserById(Long id) {
        userRepository.deleteUserById(id);
    }
    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }
    public User getUserByDni(String dni) {
        return userRepository.getUserByDni(dni);
    }
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }
    public void updateUser(Long id, User user) {
        userRepository.updateUser(id, user);
    }

}
