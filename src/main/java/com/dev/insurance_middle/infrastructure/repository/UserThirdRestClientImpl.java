package com.dev.insurance_middle.infrastructure.repository;

import com.dev.generated.users.client.ThirdUsersApi;
import com.dev.generated.users.dto.ThirdPartyUserWrapperClientDto;
import com.dev.insurance_middle.application.domain.ThirdPartyUser;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.UserThirdDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<ThirdPartyUser> findAllThirdUsers() {
        return thirdUsersApi.findAllThirdUsers().getUsers().stream()
                .map(userThirdDtoClientMapper::fromDtoToDomain)
                .toList();
    }

    @Override
    public ThirdPartyUser findThirdUserById(Long id) {
        return userThirdDtoClientMapper.fromDtoToDomain(thirdUsersApi.findThirdUserById(id));
    }

    @Override
    public List<Integer> saveThirdUser(List<ThirdPartyUser> userThird) {
        var users = new ThirdPartyUserWrapperClientDto();
        users.setUsers(userThird.stream().map(userThirdDtoClientMapper::fromDomainToDto).toList());

        return thirdUsersApi.saveThirdUser(users);
    }

    @Override
    public void updateThirdUser(Long id, ThirdPartyUser userThird) {
        thirdUsersApi.updateThirdUser(id, userThirdDtoClientMapper.fromDomainToDto(userThird));
    }

}