package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.PolicyControllerDto;
import com.dev.insurance_middle.application.domain.Policy;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PolicyDtoControllerMapper {

    Policy fromDtoToDomain(PolicyControllerDto policyDto);
    PolicyControllerDto fromDomainToDto(Policy policyDomain);

}
