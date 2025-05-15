package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.Part;

import java.util.List;

public interface PartRepository {

    void savePart(Part part);

    Part getPartById(Long id);

    void deletePart(Long id);

    List<Part> getAllParts();

    List<Part> getPartsByPolicyId(Long policyId);


}
