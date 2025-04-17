package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.insurance.middle.generated.middle.controller.UsersApi;
import com.dev.insurance.middle.generated.middle.dto.UserControllerDto;

import com.dev.insurance_middle.application.domain.User;
import com.dev.insurance_middle.application.service.UserService;
import com.dev.insurance_middle.infrastructure.rest.controller.mapper.UserDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UsersApi {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDtoMapper userDtoMapper;


@Override
public ResponseEntity<UserControllerDto> findById(Long userId) {
    User user = userService.getUserById(userId.toString());
    if (user != null) {
        // Asegurar que se utilice el UserDto correcto del paquete middle
        UserControllerDto userDto = userDtoMapper.fromDomainToDto(user);
        return ResponseEntity.ok(userDto);
    } else {
        return ResponseEntity.notFound().build();
    }
}


}
