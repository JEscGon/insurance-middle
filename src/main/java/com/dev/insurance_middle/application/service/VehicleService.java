package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.Vehicle;
import com.dev.insurance_middle.application.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public void deleteVehicleById(Long id) {
        vehicleRepository.deleteVehicleById(id);
    }
    public Vehicle findById(Long id) {
        return vehicleRepository.findById(id);
    }
    public Vehicle findByMatricula(String matricula) {
        return vehicleRepository.findByMatricula(matricula);
    }
    public List<Vehicle> findByUserId(Long userId) {
        return vehicleRepository.findByUserId(userId);
    }
    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAllVehicles();
    }
    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }
    public void updateVehicle(Long id, Vehicle vehicle) {
        vehicleRepository.updateVehicle(id, vehicle);
    }

}
