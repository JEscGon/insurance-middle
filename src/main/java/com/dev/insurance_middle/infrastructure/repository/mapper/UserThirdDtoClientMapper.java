package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.users.dto.ThirdPartyUserClientDto;
import com.dev.insurance_middle.application.domain.ThirdPartyUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserThirdDtoClientMapper {

    ThirdPartyUser fromDtoToDomain(ThirdPartyUserClientDto userThirdClientDto);

    ThirdPartyUserClientDto fromDomainToDto(ThirdPartyUser userThird);

}
