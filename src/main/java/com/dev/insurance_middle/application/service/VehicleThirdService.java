package com.dev.insurance_middle.application.service;

import com.dev.generated.middle.dto.ThirdPartyVehiclesWrapperControllerDto;
import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import com.dev.insurance_middle.application.repository.VehicleThirdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleThirdService {

    private final VehicleThirdRepository vehicleThirdRepository;

    public void deleteThirdVehicleById(Long id) {
        vehicleThirdRepository.deleteThirdVehicleById(id);
    }
    public ThirdPartyVehicle findByMatriculaThird(String matricula) {
        return vehicleThirdRepository.findByMatriculaThird(matricula);
    }
    public ThirdPartyVehicle getThirdVehicleById(Long id) {
        return vehicleThirdRepository.getThirdVehicleById(id);
    }
    public List<Integer> saveThirdVehicle(List<ThirdPartyVehicle> vehiclesThird) {
        return vehicleThirdRepository.saveThirdVehicle(vehiclesThird);
    }
    public void updateThirdVehicle(Long id, ThirdPartyVehicle vehicleThird) {
        vehicleThirdRepository.updateThirdVehicle(id, vehicleThird);
    }
    public List<ThirdPartyVehicle> getAllThirdVehicles() {
        return vehicleThirdRepository.getAllThirdVehicles();
    }

}
