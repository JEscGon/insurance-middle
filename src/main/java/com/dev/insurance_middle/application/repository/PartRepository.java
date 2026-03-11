package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.Part;

import java.util.List;

public interface PartRepository {

    void deletePart(Integer id);
    List<Part> getAllParts();
    Part getPartById(Integer id);
    List<Part> getPartsByPolicyId(Integer policyId);
    void savePart(Part part);
    void updatePart(Integer id, Part part);

}
