package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.*;
import com.dev.insurance_middle.application.exception.PartNosSavedException;
import com.dev.insurance_middle.application.repository.PartRepository;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import com.dev.insurance_middle.application.repository.VehicleThirdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PartsService {

    private final UserThirdRepository userThirdRepository;
    private final VehicleThirdRepository vehicleThirdRepository;
    private final PartRepository partRepository;

    public void uploadPart(Part part) {
        List<ThirdPartyUser> thirdPartyUsers = part.getThirdPartyUsers();
        List<Integer> savedUsers = new ArrayList<>();
        try {
           savedUsers = userThirdRepository.saveThirdUser(thirdPartyUsers);
            part.setThirdPartyUsers(savedUsers.stream()
                    .map(id -> ThirdPartyUser.builder().id(id).build())
                    .toList());
            savePart(part);
        } catch (PartNosSavedException e) {  // Rollback en caso de error
            rollbackThirdPartyUsers(savedUsers);
            throw new PartNosSavedException();
        }
    }

    private void rollbackThirdPartyUsers(List<Integer> thirdPartyUsers) {
        thirdPartyUsers.forEach(id -> userThirdRepository.deleteThirdUserById(id.longValue()));
    }



    private void savePart(Part part) {
        partRepository.savePart(part);
    }

    public void deletePartById(Long id) {
        partRepository.deletePart(id);
    }

    public List<Part> getAllParts() {
        return partRepository.getAllParts();
    }

    public List<Part> getPartsByPolicyId(Long id) {
        return partRepository.getPartsByPolicyId(id);
    }

    public Part findById(Long id) {
        return partRepository.getPartById(id);
    }
}
