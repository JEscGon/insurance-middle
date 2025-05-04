package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.users.dto.ThirdPartyVehicleClientDto;
import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleThirdDtoClientMapper {

    ThirdPartyVehicle fromDtoToDomain(ThirdPartyVehicleClientDto vehicleThirdClientDto);
    ThirdPartyVehicleClientDto fromDomainToDto(ThirdPartyVehicle vehicleThird);


}
