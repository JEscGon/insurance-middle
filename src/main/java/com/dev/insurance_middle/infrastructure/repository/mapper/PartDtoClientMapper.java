package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.policies.dto.PartClientDto;
import com.dev.insurance_middle.application.domain.Part;
import com.dev.insurance_middle.application.domain.ThirdPartyInfo;
import com.dev.insurance_middle.application.domain.ThirdPartyUser;
import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PartDtoClientMapper {

    @Mapping(target = "thirdPartyId",
            expression = "java(part.getThirdPartyInfo() != null && part.getThirdPartyInfo().getThirdPartyUser() != null && !part.getThirdPartyInfo().getThirdPartyUser().isEmpty() ? part.getThirdPartyInfo().getThirdPartyUser().get(0).getId() : null)")
    @Mapping(target = "thirdPartyVehicleId",
            expression = "java(part.getThirdPartyInfo() != null && part.getThirdPartyInfo().getThirdPartyVehicle() != null && !part.getThirdPartyInfo().getThirdPartyVehicle().isEmpty() ? part.getThirdPartyInfo().getThirdPartyVehicle().get(0).getId() : null)")
    PartClientDto fromDomainToDto(Part part);

    @Mapping(target = "thirdPartyInfo",
            expression = "java(buildThirdPartyInfo(partClientDto.getThirdPartyId(), partClientDto.getThirdPartyVehicleId()))")
    Part fromDtoToDomain(PartClientDto partClientDto);

    default ThirdPartyInfo buildThirdPartyInfo(Integer thirdPartyId, Integer thirdPartyVehicleId) {
        if (thirdPartyId == null && thirdPartyVehicleId == null) {
            return null;
        }
        ThirdPartyInfo info = new ThirdPartyInfo();
        if (thirdPartyId != null) {
            ThirdPartyUser user = new ThirdPartyUser();
            user.setId(thirdPartyId);
            info.setThirdPartyUser(List.of(user));
        }
        if (thirdPartyVehicleId != null) {
            ThirdPartyVehicle vehicle = new ThirdPartyVehicle();
            vehicle.setId(thirdPartyVehicleId);
            info.setThirdPartyVehicle(List.of(vehicle));
        }
        return info;
    }

}
