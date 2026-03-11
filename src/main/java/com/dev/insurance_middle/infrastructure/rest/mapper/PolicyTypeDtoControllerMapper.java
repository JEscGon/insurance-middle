package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.PolicyTypeControllerDto;
import com.dev.insurance_middle.application.domain.PolicyType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PolicyTypeDtoControllerMapper {

    PolicyType fromDtoToDomain(PolicyTypeControllerDto policyTypeControllerDto);

    PolicyTypeControllerDto fromDomainToDto(PolicyType policyType);
}
