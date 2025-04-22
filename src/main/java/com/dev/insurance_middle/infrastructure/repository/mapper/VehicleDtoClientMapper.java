package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.users.dto.VehicleClientDto;
import com.dev.insurance_middle.application.domain.Vehicle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleDtoClientMapper {

    Vehicle fromDtoToDomain(VehicleClientDto vehicleClientDto);
    VehicleClientDto fromDomainToDto(Vehicle vehicle);

}
