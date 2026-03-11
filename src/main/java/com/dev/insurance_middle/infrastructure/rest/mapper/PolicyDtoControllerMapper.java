package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.PolicyControllerDto;
import com.dev.insurance_middle.application.domain.Policy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PolicyDtoControllerMapper {

    @Mapping(target = "parts", ignore = true)
    Policy fromDtoToDomain(PolicyControllerDto policyControllerDto);

    PolicyControllerDto fromDomainToDto(Policy policy);
}
