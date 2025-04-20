package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.insurance_middle.application.domain.User;
import com.dev.generated.middle.dto.UserControllerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoControllerMapper {
    User fromDtoToDomain(UserControllerDto userDto);
    UserControllerDto fromDomainToDto(User userDomain);
}
