package com.dev.insurance_middle.infrastructure.repository;


import com.dev.generated.policies.client.PartsApi;
import com.dev.generated.policies.dto.PartClientDto;
import com.dev.insurance_middle.application.domain.Part;
import com.dev.insurance_middle.application.repository.PartRepository;
import com.dev.insurance_middle.application.repository.UserRepository;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import com.dev.insurance_middle.application.repository.VehicleThirdRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.PartDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PartRestClientImpl implements PartRepository {

     private final PartsApi partApi;
     private final PartDtoClientMapper partDtoClientMapper;
     private final UserRepository userRepository;
     private final VehicleThirdRepository vehicleThirdRepository;
     private final UserThirdRepository userThirdRepository;

    @Override
    public void savePart(Part part) {
        partApi.savePart(partDtoClientMapper.fromDomainToDto(part));
    }

    @Override
    public Part getPartById(Long id) {
        return partDtoClientMapper.fromDtoToDomain(partApi.getPartById(Math.toIntExact(id)));
    }

    @Override
    public void deletePart(Long id) {
        partApi.deletePartById(Math.toIntExact(id));
    }

    @Override
    public List<Part> getAllParts() {
        return partApi.getAllParts().stream()
                .map(partDtoClientMapper::fromDtoToDomain)
                .toList();
    }

    @Override
    public List<Part> getPartsByPolicyId(Long policyId) {
        return partApi.getPartsByPolicyId(Math.toIntExact(policyId)).stream()
                .map(partDtoClientMapper::fromDtoToDomain)
                .toList();
    }

}
