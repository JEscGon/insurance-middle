package com.dev.insurance_middle.application.repository;

import com.dev.generated.users.dto.UserThirdClientDto;
import com.dev.insurance_middle.application.domain.UserThird;

import java.util.List;

public interface UserThirdRepository {

    void deleteThirdUserById(Long userId);
    List<UserThird> findAllThirdUsers();
    UserThird findThirdUserById(Long id);
    void saveThirdUser(UserThird userThird);
    void updateThirdUser(Long id, UserThird userThird);

}
