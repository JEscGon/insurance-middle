package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.generated.middle.controller.ThirdVehiclesApi;
import com.dev.generated.middle.dto.ThirdPartyVehicleControllerDto;
import com.dev.insurance_middle.application.service.VehicleThirdService;
import com.dev.insurance_middle.infrastructure.rest.mapper.VehicleThirdDtoControllerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleThirdController implements ThirdVehiclesApi {

    @Autowired
    private VehicleThirdService vehicleThirdService;
    @Autowired
    private VehicleThirdDtoControllerMapper vehicleThirdDtoControllerMapper;

    @Override
    public ResponseEntity<Void> deleteThirdVehicleById(Long id) {
        vehicleThirdService.deleteThirdVehicleById(id);
        return ResponseEntity.noContent().build();
    }


    public ResponseEntity<Void> saveThirdVehicle(ThirdPartyVehicleControllerDto vehicleThirdDto) {
        vehicleThirdService.saveThirdVehicle(vehicleThirdDtoControllerMapper.fromDtoToDomain(vehicleThirdDto));;
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> updateThirdVehicle(Long id, ThirdPartyVehicleControllerDto vehicleThirdDto) {
        vehicleThirdService.updateThirdVehicle(id, vehicleThirdDtoControllerMapper.fromDtoToDomain(vehicleThirdDto));
        return ResponseEntity.ok().build();
    }
    @Override
    public ResponseEntity<ThirdPartyVehicleControllerDto> getThirdVehicleById(Long id) {
        return ResponseEntity.ok(vehicleThirdDtoControllerMapper.fromDomainToDto(vehicleThirdService.getThirdVehicleById(id)));
    }
    @Override
    public ResponseEntity<ThirdPartyVehicleControllerDto> findByMatriculaThird(String matricula) {
        return ResponseEntity.ok(vehicleThirdDtoControllerMapper.fromDomainToDto(vehicleThirdService.findByMatriculaThird(matricula)));
    }
    @Override
    public ResponseEntity<List<ThirdPartyVehicleControllerDto>> getAllThirdVehicles() {
        return ResponseEntity.ok(vehicleThirdService.getAllThirdVehicles().stream()
                .map(vehicleThirdDtoControllerMapper::fromDomainToDto)
                .toList());
    }


}
