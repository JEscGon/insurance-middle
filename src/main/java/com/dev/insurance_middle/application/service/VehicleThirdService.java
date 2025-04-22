package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.VehicleThird;
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
    public VehicleThird findByMatriculaThird(String matricula) {
        return vehicleThirdRepository.findByMatriculaThird(matricula);
    }
    public VehicleThird getThirdVehicleById(Long id) {
        return vehicleThirdRepository.getThirdVehicleById(id);
    }
    public void saveThirdVehicle(VehicleThird vehicleThird) {
        vehicleThirdRepository.saveThirdVehicle(vehicleThird);
    }
    public void updateThirdVehicle(Long id, VehicleThird vehicleThird) {
        vehicleThirdRepository.updateThirdVehicle(id, vehicleThird);
    }
    public List<VehicleThird> getAllThirdVehicles() {
        return vehicleThirdRepository.getAllThirdVehicles();
    }

}
