package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.policies.dto.PolicyClientDto;
import com.dev.insurance_middle.application.domain.Policy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PolicyDtoClientMapper {

    @Mapping(target = "parts", ignore = true)
    Policy fromDtoToDomain(PolicyClientDto policyClientDto);

    PolicyClientDto fromDomainToDto(Policy policy);
}
