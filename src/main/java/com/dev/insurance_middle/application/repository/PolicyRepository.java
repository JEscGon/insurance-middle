package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.Policy;

import java.util.List;

public interface PolicyRepository {

    Policy findById(String id);
    void deletePolicyById(String id);
    List<Policy> findAllPolicies();
    Policy getPolicyByDni(String dni);
    Policy getPolicyByMatricula(String matricula);
    Policy getPolicyByUserId(Integer userId);
    void save(Policy policy);
    void updatePolicy(String id, Policy policy);
}
