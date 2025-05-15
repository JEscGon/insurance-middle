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

    //TODO: fix this ¿?
    public void uploadPart(Part part) {
        saveThirdUserInfo(part.getThirdPartyId().stream().map(Long::intValue).toList());
    saveThirdVehiclesInfo(part.getThirdPartyVehicleId().stream().map(Long::intValue).toList());
        try {
            savePart(part);
       } catch (PartNosSavedException exception) {
//            rollbackSaveThirdPartyInfo(
//                part.getThirdPartyId().stream().map(Long::intValue).toList(),
//                part.getThirdPartyVehicleId().stream().map(Long::intValue).toList()
//            );
           throw exception;
        }
    }


//    //TODO: ¿?¿implement this?¿?
//    private void rollbackSaveThirdPartyInfo(List<Integer> thirdPartyUsers, List<Integer> thirdPartyVehicles) {
//
//    }



    private List<Long> saveThirdUserInfo(List<Integer> thirdPartyUsers) {
        List<Long> savedUserIds = new ArrayList<>();
        for (Integer thirdPartyUser : thirdPartyUsers) {
            ThirdPartyUser userThird = userThirdRepository.findThirdUserById(Long.valueOf(thirdPartyUser));
            if (userThird == null) {
                throw new RuntimeException("User Third not found");
            }
            savedUserIds.add(Long.valueOf(userThird.getId()));
        }
        return savedUserIds;
    }

    private List<Long> saveThirdVehiclesInfo(List<Integer> thirdPartyVehicles) {
        List<Long> savedVehicleIds = new ArrayList<>();
        for (Integer thirdPartyVehicle : thirdPartyVehicles) {
            ThirdPartyVehicle vehicleThird = vehicleThirdRepository.getThirdVehicleById(Long.valueOf(thirdPartyVehicle));
            if (vehicleThird == null) {
                throw new RuntimeException("Vehicle Third not found");
            }
            savedVehicleIds.add(Long.valueOf(vehicleThird.getId()));
        }
        return savedVehicleIds;
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
