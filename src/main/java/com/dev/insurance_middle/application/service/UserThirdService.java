package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.UserThird;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserThirdService {

    private final UserThirdRepository userThirdRepository;

    public void deleteThirdUserById(Long userId) {
        userThirdRepository.deleteThirdUserById(userId);
    }
    public List<UserThird> findAllThirdUsers() {
        return userThirdRepository.findAllThirdUsers();
    }
    public UserThird findThirdUserById(Long id) {
        return userThirdRepository.findThirdUserById(id);
    }
    public void saveThirdUser(UserThird userThird) {
        userThirdRepository.saveThirdUser(userThird);
    }
    public void updateThirdUser(Long id, UserThird userThird) {
        userThirdRepository.updateThirdUser(id, userThird);
    }

}
