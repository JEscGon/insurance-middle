package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.PolicyType;
import com.dev.insurance_middle.application.repository.PolicyTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PolicyTypeService {

    private final PolicyTypeRepository policyTypeRepository;

    public List<PolicyType> findAllPolicyTypes() {
        return policyTypeRepository.findAllPolicyTypes();
    }

    public PolicyType findPolicyTypeById(Integer id) {
        return policyTypeRepository.findPolicyTypeById(id);
    }
}
