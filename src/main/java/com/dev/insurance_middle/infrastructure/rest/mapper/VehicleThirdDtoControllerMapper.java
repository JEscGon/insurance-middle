package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.ThirdPartyVehicleControllerDto;
import com.dev.generated.middle.dto.ThirdPartyVehiclesWrapperControllerDto;
import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import org.mapstruct.Mapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface VehicleThirdDtoControllerMapper {

    ThirdPartyVehicle fromDtoToDomain(ThirdPartyVehicleControllerDto vehicleThirdDto);
    ThirdPartyVehicleControllerDto fromDomainToDto(ThirdPartyVehicle vehicleThirdDomain);
        // Nuevo método para el wrapper
    default List<ThirdPartyVehicle> fromWrapperDtoToDomain(ThirdPartyVehiclesWrapperControllerDto wrapperDto) {
        if (wrapperDto == null || wrapperDto.getVehicles() == null) {
            return Collections.emptyList();
        }
        return wrapperDto.getVehicles().stream()
                .map(this::fromDtoToDomain)
                .collect(Collectors.toList());
    }


}
