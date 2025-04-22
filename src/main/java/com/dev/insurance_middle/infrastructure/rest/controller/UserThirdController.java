package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.generated.middle.controller.ThirdUsersApi;
import com.dev.generated.middle.dto.UserThirdControllerDto;
import com.dev.insurance_middle.application.service.UserThirdService;
import com.dev.insurance_middle.infrastructure.rest.mapper.UserThirdDtoControllerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserThirdController implements ThirdUsersApi {

    @Autowired
    private UserThirdService userThirdService;
    @Autowired
    private UserThirdDtoControllerMapper userThirdDtoControllerMapper;

    @Override
    public ResponseEntity<Void> deleteThirdUserById(Long userId) {
        userThirdService.deleteThirdUserById(userId);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<UserThirdControllerDto>> findAllThirdUsers() {
        List<UserThirdControllerDto> userDtos = userThirdService.findAllThirdUsers().stream()
                .map(userThirdDtoControllerMapper::fromDomainToDto)
                .toList();
        return ResponseEntity.ok(userDtos);
    }

    @Override
    public ResponseEntity<UserThirdControllerDto> findThirdUserById(Long userId) {
        UserThirdControllerDto userDto = userThirdDtoControllerMapper.fromDomainToDto(userThirdService.findThirdUserById(userId));
        return ResponseEntity.ok(userDto);
    }

    @Override
    public ResponseEntity<Void> saveThirdUser(UserThirdControllerDto userDto) {
        userThirdService.saveThirdUser(userThirdDtoControllerMapper.fromDtoToDomain(userDto));
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> updateThirdUser(Long userId, UserThirdControllerDto userDto) {
        userThirdService.updateThirdUser(userId, userThirdDtoControllerMapper.fromDtoToDomain(userDto));
        return ResponseEntity.noContent().build();
    }

}
