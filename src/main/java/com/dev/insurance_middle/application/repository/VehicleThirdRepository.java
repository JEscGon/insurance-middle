package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import java.util.List;

public interface VehicleThirdRepository {

    void deleteThirdVehicleById(Long id);
    ThirdPartyVehicle findByMatriculaThird(String matricula);
    List<ThirdPartyVehicle> getAllThirdVehicles();
    ThirdPartyVehicle getThirdVehicleById(Long id);
    List<Integer> saveThirdVehicle(List<ThirdPartyVehicle> listVehicleThird);
    void updateThirdVehicle(Long id, ThirdPartyVehicle vehicleThird);

}
