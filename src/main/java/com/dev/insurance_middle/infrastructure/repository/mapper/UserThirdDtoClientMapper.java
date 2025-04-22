package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.users.dto.UserThirdClientDto;
import com.dev.insurance_middle.application.domain.UserThird;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserThirdDtoClientMapper {

    UserThird fromDtoToDomain(UserThirdClientDto userThirdClientDto);
    UserThirdClientDto fromDomainToDto(UserThird userThird);

}
