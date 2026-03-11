package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.*;
import com.dev.insurance_middle.application.exception.PartNosSavedException;
import com.dev.insurance_middle.application.repository.PartRepository;
import com.dev.insurance_middle.application.repository.UserRepository;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import com.dev.insurance_middle.application.repository.VehicleThirdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartsService {

    private final UserRepository userRepository;

    private final UserThirdRepository userThirdRepository;

    private final VehicleThirdRepository vehicleThirdRepository;

    private final PartRepository partRepository;

    public void uploadPart(Part part) {

        saveThirdUserInfo(part.getThirdPartyInfo());

        if (part.getThirdPartyInfo() != null && part.getThirdPartyInfo().getThirdPartyVehicle() != null) {
            saveThirdVehicleInfo(part.getThirdPartyInfo().getThirdPartyVehicle());
        }

        try {
            savePart(part);
        } catch (PartNosSavedException exception) {
            rollbackSaveThirdPartyInfo(part.getThirdPartyInfo());
            throw exception;
        }
    }

    private void rollbackSaveThirdPartyInfo(ThirdPartyInfo thirdPartyInfo) {
        if (thirdPartyInfo == null) {
            return;
        }
        if (thirdPartyInfo.getThirdPartyUser() != null) {
            thirdPartyInfo.getThirdPartyUser().forEach(user ->
                    userThirdRepository.deleteThirdUserById(Long.valueOf(user.getId())));
        }
        if (thirdPartyInfo.getThirdPartyVehicle() != null) {
            thirdPartyInfo.getThirdPartyVehicle().forEach(vehicle ->
                    vehicleThirdRepository.deleteThirdVehicleById(Long.valueOf(vehicle.getId())));
        }
    }

    private void saveThirdUserInfo(ThirdPartyInfo thirdPartyUser) {

        userThirdRepository.saveThirdUser(thirdPartyUser.getThirdPartyUser());
    }

    private void saveThirdVehicleInfo(List<ThirdPartyVehicle> thirdPartyVehicle) {
        vehicleThirdRepository.saveThirdVehicle(thirdPartyVehicle);
    }

    private void savePart(Part part) {
        partRepository.savePart(part);
    }

    public void deletePart(Integer id) {
        partRepository.deletePart(id);
    }

    public List<Part> getAllParts() {
        return partRepository.getAllParts();
    }

    public Part getPartById(Integer id) {
        return partRepository.getPartById(id);
    }

    public List<Part> getPartsByPolicyId(Integer policyId) {
        return partRepository.getPartsByPolicyId(policyId);
    }

    public void updatePart(Integer id, Part part) {
        partRepository.updatePart(id, part);
    }

}
