package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.policies.dto.PolicyTypeClientDto;
import com.dev.insurance_middle.application.domain.PolicyType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PolicyTypeDtoClientMapper {

    PolicyType fromDtoToDomain(PolicyTypeClientDto policyTypeClientDto);

    PolicyTypeClientDto fromDomainToDto(PolicyType policyType);
}
