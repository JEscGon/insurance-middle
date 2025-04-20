package com.dev.insurance_middle.infrastructure.repository;

import com.dev.insurance_middle.application.domain.User;
import com.dev.insurance_middle.infrastructure.repository.mapper.UserDtoClientMapper;
import com.dev.insurance_middle.application.repository.UserRepository;
import com.dev.generated.users.client.UsersApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryRestClientImpl implements UserRepository {

    private final UsersApi usersApi;

    private final UserDtoClientMapper userDtoClientMapper;

    @Override
    public User findById(Long userId) {
        return userDtoClientMapper.fromDtoToDomain(usersApi.findById(Long.valueOf(userId)));
    }

}