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
    public Policy findById(String id) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyById(id));
    }

    @Override
    public void deletePolicyById(String id) {
        policiesApi.deletePolicyById(id);
    }

    @Override
    public List<Policy> findAllPolicies() {
        return policiesApi.getAllPolicies().stream()
                .map(policyDtoClientMapper::fromDtoToDomain)
                .toList();
    }

    @Override
    public Policy getPolicyByDni(String dni) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyByDni(dni));
    }

    @Override
    public Policy getPolicyByMatricula(String matricula) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyByMatricula(matricula));
    }

    @Override
    public Policy getPolicyByUserId(Integer userId) {
        return policyDtoClientMapper.fromDtoToDomain(policiesApi.getPolicyByUserId(userId));
    }

    @Override
    public void save(Policy policy) {
        policiesApi.savePolicy(policyDtoClientMapper.fromDomainToDto(policy));
    }

    @Override
    public void updatePolicy(String id, Policy policy) {
        policiesApi.updatePolicy(id, policyDtoClientMapper.fromDomainToDto(policy));
    }
}
