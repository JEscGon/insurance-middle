package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.ThirdPartyUserControllerDto;
import com.dev.insurance_middle.application.domain.ThirdPartyUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserThirdDtoControllerMapper {

    ThirdPartyUser fromDtoToDomain(ThirdPartyUserControllerDto userThirdDto);
    ThirdPartyUserControllerDto fromDomainToDto(ThirdPartyUser userThirdDomain);

}
