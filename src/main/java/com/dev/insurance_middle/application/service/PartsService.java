package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.*;
import com.dev.insurance_middle.application.exception.PartNosSavedException;
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
    ;

    public void uploadPart(Part part) {

        saveThirdUserInfo(part.getThirdPartyInfo());
        ;

        try {
            savePart(part);
        } catch (PartNosSavedException exception) {
            rollbackSaveThhirdPartyInfo(part.getThirdPartyInfo());
            throw exception;
        }
    }

    private void rollbackSaveThhirdPartyInfo(ThirdPartyInfo thirdPartyInfo) {

    }

    private void saveThirdUserInfo(ThirdPartyInfo thirdPartyUser) {

        userThirdRepository.saveThirdUser(thirdPartyUser.getThirdPartyUser());
    }

    private void saveThirdUVehicleInfo(List<ThirdPartyVehicle> thirdPartyVehicle) {
        vehicleThirdRepository.saveThirdVehicle(thirdPartyVehicle);
    }

    private void savePart(Part part) {

    }


}
