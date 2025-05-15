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

    public void update(Policy policy) {
        policyRepository.updatePolicy(policy);
    }
    public void save(Policy policy) {
        policyRepository.savePolicy(policy);
    }
    public void deleteById(String id) {
        policyRepository.deletePolicyById(id);
    }
    public List<Policy> findAll() {
        return policyRepository.findAllPolicies();
    }
    public Policy findById(String id) {
        return policyRepository.findPolicyById(id);
    }
    public Policy findByDni(String dni) {
        return policyRepository.findPolicyByDni(dni);
    }
    public Policy findByMatricula(String matricula) {
        return policyRepository.findPolicyByMatricula(matricula);
    }
    public Policy findByVehicleId(String userId) {
        return policyRepository.findPolicyByUserId(userId);
    }




}
