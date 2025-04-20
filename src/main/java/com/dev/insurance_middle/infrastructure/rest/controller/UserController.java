package com.dev.insurance_middle.infrastructure.rest.controller;



import com.dev.insurance_middle.application.domain.User;
import com.dev.insurance_middle.application.service.UserService;
import com.dev.generated.middle.controller.UsersApi;
import com.dev.generated.middle.dto.UserControllerDto;
import com.dev.insurance_middle.infrastructure.rest.mapper.UserDtoControllerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

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


}
