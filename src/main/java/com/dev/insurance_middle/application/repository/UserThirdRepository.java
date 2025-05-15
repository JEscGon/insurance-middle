package com.dev.insurance_middle.application.repository;


import com.dev.insurance_middle.application.domain.ThirdPartyUser;

import java.util.List;

public interface UserThirdRepository {

    void deleteThirdUserById(Long userId);
    List<ThirdPartyUser> findAllThirdUsers();
    ThirdPartyUser findThirdUserById(Long id);
    List<Integer> saveThirdUser(List<ThirdPartyUser> userThird);
    void updateThirdUser(Long id, ThirdPartyUser userThird);

}
