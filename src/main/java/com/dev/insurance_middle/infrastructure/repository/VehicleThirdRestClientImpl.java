package com.dev.insurance_middle.infrastructure.repository;

import com.dev.generated.users.client.ThirdVehiclesApi;
import com.dev.generated.users.dto.ThirdPartyVehiclesWrapperClientDto;

import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import com.dev.insurance_middle.application.repository.VehicleThirdRepository;
import com.dev.insurance_middle.infrastructure.repository.mapper.VehicleThirdDtoClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class VehicleThirdRestClientImpl implements VehicleThirdRepository {

    private final ThirdVehiclesApi thirdVehiclesApi;
    private final VehicleThirdDtoClientMapper vehicleThirdDtoClientMapper;

    @Override
    public void deleteThirdVehicleById(Long id) {
        thirdVehiclesApi.deleteThirdVehicleById(id);
    }

    public ThirdPartyVehicle findByMatriculaThird(String matricula) {
        return vehicleThirdDtoClientMapper.fromDtoToDomain(thirdVehiclesApi.findByMatriculaThird(matricula));
    }

    @Override
    public List<ThirdPartyVehicle> getAllThirdVehicles() {
        return thirdVehiclesApi.getAllThirdVehicles().getVehicles().stream()
                .map(vehicleThirdDtoClientMapper::fromDtoToDomain)
                .toList();


    }
    @Override
    public ThirdPartyVehicle getThirdVehicleById(Long id) {
        return vehicleThirdDtoClientMapper.fromDtoToDomain(thirdVehiclesApi.getThirdVehicleById(id));
    }


    @Override
    public List<Integer> saveThirdVehicle(List<ThirdPartyVehicle> listVehicleThird) {
        var vehicles = new ThirdPartyVehiclesWrapperClientDto();
        vehicles.setVehicles(listVehicleThird.stream().map(vehicleThirdDtoClientMapper::fromDomainToDto).toList());
        return thirdVehiclesApi.saveThirdVehicle(vehicles);
    }

    @Override
    public void updateThirdVehicle(Long id, ThirdPartyVehicle vehicleThird) {
        thirdVehiclesApi.updateThirdVehicle(id, vehicleThirdDtoClientMapper.fromDomainToDto(vehicleThird));
    }

}
