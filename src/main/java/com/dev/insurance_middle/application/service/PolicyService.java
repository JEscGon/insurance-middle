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

    public List<Policy> findAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy findPolicyById(Long id) {
        return policyRepository.findById(id);
    }

    public Policy findByDni(String dni) {
        return policyRepository.findByDni(dni);
    }

    public Policy findByMatricula(String matricula) {
        return policyRepository.findByMatricula(matricula);
    }

    public Policy findByUserId(Long userId) {
        return policyRepository.findByUserId(userId);
    }

    public void savePolicy(Policy policy) {
        policyRepository.save(policy);
    }

    public void updatePolicy(Long id, Policy policy) {
        policyRepository.update(id, policy);
    }

    public void deletePolicy(Long id) {
        policyRepository.delete(id);
    }
}
