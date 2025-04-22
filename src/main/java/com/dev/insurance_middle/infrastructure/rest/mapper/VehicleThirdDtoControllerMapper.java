package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.VehicleThirdControllerDto;
import com.dev.insurance_middle.application.domain.VehicleThird;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleThirdDtoControllerMapper {

    VehicleThird fromDtoToDomain(VehicleThirdControllerDto vehicleThirdDto);
    VehicleThirdControllerDto fromDomainToDto(VehicleThird vehicleThirdDomain);



}
