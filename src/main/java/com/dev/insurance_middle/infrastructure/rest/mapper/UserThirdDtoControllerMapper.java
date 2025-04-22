package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.UserThirdControllerDto;
import com.dev.insurance_middle.application.domain.UserThird;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserThirdDtoControllerMapper {

    UserThird fromDtoToDomain(UserThirdControllerDto userThirdDto);
    UserThirdControllerDto fromDomainToDto(UserThird userThirdDomain);

}
