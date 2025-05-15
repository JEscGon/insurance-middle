package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.policies.dto.PolicyClientDto;
import com.dev.insurance_middle.application.domain.Policy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PolicyDtoClientMapper {

    PolicyClientDto fromDomainToDto(Policy policyDomain);
    Policy fromDtoToDomain(PolicyClientDto policyDto);

}
