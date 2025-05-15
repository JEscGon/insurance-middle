package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.ThirdPartyUser;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.UserThirdDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserThirdService {

    private final UserThirdRepository userThirdRepository;

    private final UserThirdDtoClientMapper userThirdDtoClientMapper;;

    public void deleteThirdUserById(Long userId) {
        userThirdRepository.deleteThirdUserById(userId);
    }

    public List<ThirdPartyUser> findAllThirdUsers() {
        return userThirdRepository.findAllThirdUsers();
    }

    public ThirdPartyUser findThirdUserById(Long id) {
        return userThirdRepository.findThirdUserById(id);
    }

    public List<Integer> saveThirdUser(List<ThirdPartyUser> usersThird) {
       return userThirdRepository.saveThirdUser(usersThird);
    }
    public void updateThirdUser(Long id, ThirdPartyUser userThird) {
        userThirdRepository.updateThirdUser(id, userThird);
    }

}
