package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import com.dev.insurance_middle.application.repository.VehicleThirdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
    public void saveThirdVehicle(ThirdPartyVehicle vehicleThird) {
        vehicleThirdRepository.saveThirdVehicle(vehicleThird);
    }
    public void updateThirdVehicle(Long id, ThirdPartyVehicle vehicleThird) {
        vehicleThirdRepository.updateThirdVehicle(id, vehicleThird);
    }
    public List<ThirdPartyVehicle> getAllThirdVehicles() {
        return vehicleThirdRepository.getAllThirdVehicles();
    }

}
