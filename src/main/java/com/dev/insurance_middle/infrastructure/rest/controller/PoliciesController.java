package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.generated.middle.controller.PoliciesApi;

import com.dev.generated.middle.dto.PolicyControllerDto;
import com.dev.insurance_middle.application.service.PolicyService;
import com.dev.insurance_middle.infrastructure.rest.mapper.PolicyDtoControllerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PoliciesController implements PoliciesApi {

    private final PolicyService policyService;
    private final PolicyDtoControllerMapper policyDtoControllerMapper;



    @Override
    public ResponseEntity<Void> deletePolicyById(String id) {
        policyService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<PolicyControllerDto>> getAllPolicies() {
        var policies = policyService.findAll();
        var policiesDto = policies.stream()
                .map(policyDtoControllerMapper::fromDomainToDto)
                .toList();
        return ResponseEntity.ok(policiesDto);}


    @Override
    public ResponseEntity<PolicyControllerDto> getPolicyByDni(String dni) {
        var policy = policyDtoControllerMapper.fromDomainToDto(policyService.findByDni(dni));
        return ResponseEntity.ok(policy);
    }

    @Override
    public ResponseEntity<PolicyControllerDto> getPolicyByMatricula(String matricula) {
        var policy = (PolicyControllerDto) policyDtoControllerMapper.fromDomainToDto(policyService.findByMatricula(matricula));
        return ResponseEntity.ok(policy);
    }

}
