package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.users.dto.VehicleThirdClientDto;
import com.dev.insurance_middle.application.domain.VehicleThird;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleThirdDtoClientMapper {

    VehicleThird fromDtoToDomain(VehicleThirdClientDto vehicleThirdClientDto);
    VehicleThirdClientDto fromDomainToDto(VehicleThird vehicleThird);


}
