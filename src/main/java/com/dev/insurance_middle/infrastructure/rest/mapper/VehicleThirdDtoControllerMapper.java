package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.ThirdPartyVehicleControllerDto;
import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleThirdDtoControllerMapper {

    ThirdPartyVehicle fromDtoToDomain(ThirdPartyVehicleControllerDto vehicleThirdDto);
    ThirdPartyVehicleControllerDto fromDomainToDto(ThirdPartyVehicle vehicleThirdDomain);



}
