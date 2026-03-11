package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.Policy;
import com.dev.insurance_middle.application.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PolicyService {

    private final PolicyRepository policyRepository;

    public Policy findPolicyById(String id) {
        return policyRepository.findById(id);
    }

    public void deletePolicyById(String id) {
        policyRepository.deletePolicyById(id);
    }

    public List<Policy> findAllPolicies() {
        return policyRepository.findAllPolicies();
    }

    public Policy getPolicyByDni(String dni) {
        return policyRepository.getPolicyByDni(dni);
    }

    public Policy getPolicyByMatricula(String matricula) {
        return policyRepository.getPolicyByMatricula(matricula);
    }

    public Policy getPolicyByUserId(Integer userId) {
        return policyRepository.getPolicyByUserId(userId);
    }

    public void savePolicy(Policy policy) {
        policyRepository.save(policy);
    }

    public void updatePolicy(String id, Policy policy) {
        policyRepository.updatePolicy(id, policy);
    }
}
