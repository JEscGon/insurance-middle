package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.generated.middle.controller.PolicyTypesApi;
import com.dev.generated.middle.dto.PolicyTypeControllerDto;
import com.dev.insurance_middle.application.domain.PolicyType;
import com.dev.insurance_middle.application.service.PolicyTypeService;
import com.dev.insurance_middle.infrastructure.rest.mapper.PolicyTypeDtoControllerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PolicyTypesController implements PolicyTypesApi {

    private final PolicyTypeService policyTypeService;
    private final PolicyTypeDtoControllerMapper policyTypeDtoControllerMapper;

    @Override
    public ResponseEntity<List<PolicyTypeControllerDto>> getAllPolicyTypes() {
        List<PolicyType> policyTypes = policyTypeService.findAllPolicyTypes();
        List<PolicyTypeControllerDto> policyTypeDtos = policyTypes.stream()
                .map(policyTypeDtoControllerMapper::fromDomainToDto)
                .toList();
        return ResponseEntity.ok(policyTypeDtos);
    }

    @Override
    public ResponseEntity<PolicyTypeControllerDto> getPolicyTypeById(Integer id) {
        PolicyType policyType = policyTypeService.findPolicyTypeById(id);
        PolicyTypeControllerDto policyTypeDto = policyTypeDtoControllerMapper.fromDomainToDto(policyType);
        return ResponseEntity.ok(policyTypeDto);
    }
}
