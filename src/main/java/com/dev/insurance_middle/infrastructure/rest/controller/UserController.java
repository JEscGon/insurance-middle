package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.insurance_middle.application.domain.User;
import com.dev.insurance_middle.application.service.UserService;
import com.dev.generated.middle.controller.UsersApi;
import com.dev.generated.middle.dto.UserControllerDto;
import com.dev.insurance_middle.infrastructure.rest.mapper.UserDtoControllerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController implements UsersApi {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDtoControllerMapper userDtoControllerMapper;

    @Override
    public ResponseEntity<UserControllerDto> findById(Long userId) {
        User user = userService.findUserById(userId);
        UserControllerDto userDto = userDtoControllerMapper.fromDomainToDto(user);
        return ResponseEntity.ok(userDto);
    }

    @Override
    public ResponseEntity<Void> deleteUserById(Long id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<UserControllerDto> getUserByDni(String dni) {
        User user = userService.getUserByDni(dni);
        UserControllerDto userDto = userDtoControllerMapper.fromDomainToDto(user);
        return ResponseEntity.ok(userDto);
    }

    @Override
    public ResponseEntity<UserControllerDto> getUserByEmail(String email) {
        User user = userService.getUserByEmail(email);
        UserControllerDto userDto = userDtoControllerMapper.fromDomainToDto(user);
        return ResponseEntity.ok(userDto);
    }

    @Override
    public ResponseEntity<List<UserControllerDto>> findAllUsers() {
        List<User> users = userService.findAllUsers();
        List<UserControllerDto> userDtos = users.stream()
                .map(userDtoControllerMapper::fromDomainToDto)
                .toList();
        return ResponseEntity.ok(userDtos);
    }

    @Override
    public ResponseEntity<Void> save(UserControllerDto userDto) {
        User user = userDtoControllerMapper.fromDtoToDomain(userDto);
        userService.saveUser(user);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> updateUser(Long id, UserControllerDto userDto) {
        User user = userDtoControllerMapper.fromDtoToDomain(userDto);
        userService.updateUser(id, user);
        return ResponseEntity.ok().build();
    }



}
