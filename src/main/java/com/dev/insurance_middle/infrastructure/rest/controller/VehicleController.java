package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.generated.middle.controller.VehiclesApi;
import com.dev.generated.middle.dto.VehicleControllerDto;

import com.dev.insurance_middle.application.domain.Vehicle;
import com.dev.insurance_middle.application.service.VehicleService;
import com.dev.insurance_middle.infrastructure.rest.mapper.VehicleDtoControllerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController implements VehiclesApi {

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private VehicleDtoControllerMapper vehicleDtoControllerMapper;

    @Override
    public ResponseEntity<VehicleControllerDto> getVehicleById(Long id) {
        Vehicle vehicle = vehicleService.findById(id);
        VehicleControllerDto vehicleDto = vehicleDtoControllerMapper.fromDomainToDto(vehicle);
        return ResponseEntity.ok(vehicleDto);
    }

    @Override
    public ResponseEntity<Void> deleteVehicleById(Long id) {
        vehicleService.deleteVehicleById(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<VehicleControllerDto>> getAllVehicles() {
        List<Vehicle> vehicles = vehicleService.findAllVehicles();
        List<VehicleControllerDto> vehicleDtos = vehicles.stream()
                .map(vehicleDtoControllerMapper::fromDomainToDto)
                .toList();
        return ResponseEntity.ok(vehicleDtos);
    }

    @Override
    public ResponseEntity<VehicleControllerDto> findByMatricula(String matricula) {
        Vehicle vehicle = vehicleService.findByMatricula(matricula);
        VehicleControllerDto vehicleDto = vehicleDtoControllerMapper.fromDomainToDto(vehicle);
        return ResponseEntity.ok(vehicleDto);
    }

    @Override
    public ResponseEntity<Void> saveVehicle(VehicleControllerDto vehicleDto) {
        Vehicle vehicle = vehicleDtoControllerMapper.fromDtoToDomain(vehicleDto);
        vehicleService.save(vehicle);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> updateVehicle(Long id, VehicleControllerDto vehicleDto) {
        vehicleDto.setId(Math.toIntExact(id));
        Vehicle vehicle = vehicleDtoControllerMapper.fromDtoToDomain(vehicleDto);
        vehicleService.updateVehicle(id, vehicle);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<VehicleControllerDto>> getVehiclesByUserId(Long userId) {
        List<Vehicle> vehicles = vehicleService.findByUserId(userId);
        List<VehicleControllerDto> vehicleDtos = vehicles.stream()
                .map(vehicleDtoControllerMapper::fromDomainToDto)
                .toList();
        return ResponseEntity.ok(vehicleDtos);
    }



}
