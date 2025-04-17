package com.dev.insurance_middle.application.service;

import com.dev.insurance.middle.generated.middle.controller.UsersApi;
import com.dev.insurance.middle.generated.middle.dto.UserControllerDto;

import com.dev.insurance_middle.application.domain.User;
import com.dev.insurance_middle.infrastructure.rest.controller.mapper.UserDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired
    private UsersApi usersApi;

    @Autowired
    private UserDtoMapper userDtoMapper;

    public User getUserById(String userId) {
        ResponseEntity<UserControllerDto> response = usersApi.findById(Long.valueOf(userId));
        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            return userDtoMapper.fromDtoToDomain((UserControllerDto) response.getBody());
        }
        return null;
    }

}
