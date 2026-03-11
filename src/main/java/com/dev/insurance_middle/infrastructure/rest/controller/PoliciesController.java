package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.generated.middle.controller.PoliciesApi;
import com.dev.generated.middle.dto.PolicyControllerDto;
import com.dev.insurance_middle.application.domain.Policy;
import com.dev.insurance_middle.application.service.PolicyService;
import com.dev.insurance_middle.infrastructure.rest.mapper.PolicyDtoControllerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PoliciesController implements PoliciesApi {

    private final PolicyService policyService;
    private final PolicyDtoControllerMapper policyDtoControllerMapper;

    @Override
    public ResponseEntity<PolicyControllerDto> getPolicyById(String id) {
        Policy policy = policyService.findPolicyById(id);
        PolicyControllerDto policyDto = policyDtoControllerMapper.fromDomainToDto(policy);
        return ResponseEntity.ok(policyDto);
    }

    @Override
    public ResponseEntity<Void> deletePolicyById(String id) {
        policyService.deletePolicyById(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<PolicyControllerDto>> getAllPolicies() {
        List<Policy> policies = policyService.findAllPolicies();
        List<PolicyControllerDto> policyDtos = policies.stream()
                .map(policyDtoControllerMapper::fromDomainToDto)
                .toList();
        return ResponseEntity.ok(policyDtos);
    }

    @Override
    public ResponseEntity<PolicyControllerDto> getPolicyByDni(String dni) {
        Policy policy = policyService.getPolicyByDni(dni);
        PolicyControllerDto policyDto = policyDtoControllerMapper.fromDomainToDto(policy);
        return ResponseEntity.ok(policyDto);
    }

    @Override
    public ResponseEntity<PolicyControllerDto> getPolicyByMatricula(String matricula) {
        Policy policy = policyService.getPolicyByMatricula(matricula);
        PolicyControllerDto policyDto = policyDtoControllerMapper.fromDomainToDto(policy);
        return ResponseEntity.ok(policyDto);
    }

    @Override
    public ResponseEntity<PolicyControllerDto> getPolicyByUserId(Integer userId) {
        Policy policy = policyService.getPolicyByUserId(userId);
        PolicyControllerDto policyDto = policyDtoControllerMapper.fromDomainToDto(policy);
        return ResponseEntity.ok(policyDto);
    }

    @Override
    public ResponseEntity<Void> savePolicy(PolicyControllerDto policyControllerDto) {
        Policy policy = policyDtoControllerMapper.fromDtoToDomain(policyControllerDto);
        policyService.savePolicy(policy);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updatePolicy(String id, PolicyControllerDto policyControllerDto) {
        Policy policy = policyDtoControllerMapper.fromDtoToDomain(policyControllerDto);
        policyService.updatePolicy(id, policy);
        return ResponseEntity.ok().build();
    }
}
