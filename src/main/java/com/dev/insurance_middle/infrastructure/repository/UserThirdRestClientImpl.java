package com.dev.insurance_middle.infrastructure.repository;

import com.dev.generated.users.client.ThirdUsersApi;
import com.dev.insurance_middle.application.domain.UserThird;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.UserThirdDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserThirdRestClientImpl implements UserThirdRepository {

    private final ThirdUsersApi thirdUsersApi;
    private final UserThirdDtoClientMapper userThirdDtoClientMapper;

    @Override
    public void deleteThirdUserById(Long id) {
        thirdUsersApi.deleteThirdUserById(id);
    }
    @Override
    public List<UserThird> findAllThirdUsers() {
        return thirdUsersApi.findAllThirdUsers().stream()
                .map(userThirdDtoClientMapper::fromDtoToDomain)
                .toList();
    }
    @Override
    public UserThird findThirdUserById(Long id) {
        return userThirdDtoClientMapper.fromDtoToDomain(thirdUsersApi.findThirdUserById(id));
    }
    @Override
    public void saveThirdUser(UserThird userThird) {
        thirdUsersApi.saveThirdUser(userThirdDtoClientMapper.fromDomainToDto(userThird));
    }
    @Override
    public void updateThirdUser(Long id, UserThird userThird) {
        thirdUsersApi.updateThirdUser(id, userThirdDtoClientMapper.fromDomainToDto(userThird));
    }
}
