package com.dev.insurance_middle.infrastructure.repository;

import com.dev.generated.policies.client.PartsApi;
import com.dev.insurance_middle.application.domain.Part;
import com.dev.insurance_middle.application.repository.PartRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.PartDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PartRepositoryRestClientImpl implements PartRepository {

    private final PartsApi partsApi;
    private final PartDtoClientMapper partDtoClientMapper;

    @Override
    public void deletePart(Integer id) {
        partsApi.deletePartById(id);
    }

    @Override
    public List<Part> getAllParts() {
        return partsApi.getAllParts().stream()
                .map(partDtoClientMapper::fromDtoToDomain)
                .toList();
    }

    @Override
    public Part getPartById(Integer id) {
        return partDtoClientMapper.fromDtoToDomain(partsApi.getPartById(id));
    }

    @Override
    public List<Part> getPartsByPolicyId(Integer policyId) {
        return partsApi.getPartsByPolicyId(policyId).stream()
                .map(partDtoClientMapper::fromDtoToDomain)
                .toList();
    }

    @Override
    public void savePart(Part part) {
        partsApi.savePart(partDtoClientMapper.fromDomainToDto(part));
    }

    @Override
    public void updatePart(Integer id, Part part) {
        partsApi.updatePart(id, partDtoClientMapper.fromDomainToDto(part));
    }

}
