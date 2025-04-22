package com.dev.insurance_middle.application.repository;

import com.dev.insurance_middle.application.domain.VehicleThird;
import java.util.List;

public interface VehicleThirdRepository {

    void deleteThirdVehicleById(Long id);
    VehicleThird findByMatriculaThird(String matricula);
    List<VehicleThird> getAllThirdVehicles();
    VehicleThird getThirdVehicleById(Long id);
    void saveThirdVehicle(VehicleThird vehicleThird);
    void updateThirdVehicle(Long id, VehicleThird vehicleThird);

}
