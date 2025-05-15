package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.Policy;

import java.util.List;

public interface PolicyRepository {

    void savePolicy(Policy policy);
    Policy findPolicyById(String policyId);
    void deletePolicyById(String policyId);
    void updatePolicy(Policy policy);
    List<Policy> findAllPolicies();

    Policy findPolicyByDni(String dni);
    Policy findPolicyByMatricula(String matricula);
    Policy findPolicyByUserId(String userId);






}
