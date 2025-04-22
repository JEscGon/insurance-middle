package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.VehicleControllerDto;
import com.dev.insurance_middle.application.domain.Vehicle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleDtoControllerMapper {

    Vehicle fromDtoToDomain(VehicleControllerDto vehicleDto);
    VehicleControllerDto fromDomainToDto(Vehicle vehicleDomain);

}
