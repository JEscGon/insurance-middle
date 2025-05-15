package com.dev.insurance_middle.infrastructure.repository;

import com.dev.generated.policies.client.PoliciesApi;
import com.dev.insurance_middle.application.domain.Policy;
import com.dev.insurance_middle.application.repository.PolicyRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.PolicyDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PolicyRepositoryRestClientImpl implements PolicyRepository {

    private final PoliciesApi policiesApi;
    private final PolicyDtoClientMapper policyDtoClientMapper;

    @Override
    public void savePolicy(Policy policy) {
        policiesApi.savePolicy(policyDtoClientMapper.fromDomainToDto(policy));
    }

    @Override
    public Policy findPolicyById(String policyId) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyById(policyId));
    }

    @Override
    public void deletePolicyById(String policyId) {
        policiesApi.deletePolicyById(policyId);
    }

    @Override
    public void updatePolicy(Policy policy) {
        policiesApi.updatePolicy(String.valueOf(policy.getId()), policyDtoClientMapper.fromDomainToDto(policy));
    }

    @Override
    public List<Policy> findAllPolicies() {
        return policiesApi.getAllPolicies().stream()
                .map(policyDtoClientMapper::fromDtoToDomain)
                .toList();
    }

    @Override
    public Policy findPolicyByDni(String dni) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyByDni(dni));
    }

    @Override
    public Policy findPolicyByMatricula(String matricula) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyByMatricula(matricula));
    }

    @Override
    public Policy findPolicyByUserId(String userId) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyByUserId(Integer.valueOf(userId)));
    }
}
