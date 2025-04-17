package com.dev.insurance_middle.infrastructure.rest.controller.mapper;

import com.dev.insurance.middle.generated.middle.dto.UserControllerDto;
import org.mapstruct.Mapper;
import com.dev.insurance_middle.application.domain.User;


@Mapper(componentModel = "spring")
public interface UserDtoMapper {
    User fromDtoToDomain(UserControllerDto userDto);
    UserControllerDto fromDomainToDto(User userDomain);
}
