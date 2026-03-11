package com.dev.insurance_middle.infrastructure.repository;

import com.dev.generated.policies.client.PolicyTypesApi;
import com.dev.insurance_middle.application.domain.PolicyType;
import com.dev.insurance_middle.application.repository.PolicyTypeRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.PolicyTypeDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PolicyTypeRepositoryRestClientImpl implements PolicyTypeRepository {

    private final PolicyTypesApi policyTypesApi;
    private final PolicyTypeDtoClientMapper policyTypeDtoClientMapper;

    @Override
    public List<PolicyType> findAllPolicyTypes() {
        return policyTypesApi.getAllPolicyTypes().stream()
                .map(policyTypeDtoClientMapper::fromDtoToDomain)
                .toList();
    }

    @Override
    public PolicyType findPolicyTypeById(Integer id) {
        return policyTypeDtoClientMapper.fromDtoToDomain(policyTypesApi.getPolicyTypeById(id));
    }
}
