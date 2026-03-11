package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.PolicyType;

import java.util.List;

public interface PolicyTypeRepository {

    List<PolicyType> findAllPolicyTypes();
    PolicyType findPolicyTypeById(Integer id);
}
