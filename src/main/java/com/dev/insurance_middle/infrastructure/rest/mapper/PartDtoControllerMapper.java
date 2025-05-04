package com.dev.insurance_middle.infrastructure.rest.mapper;

import com.dev.generated.middle.dto.PartControllerDto;
import com.dev.insurance_middle.application.domain.Part;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PartDtoControllerMapper {

    Part fromDtoControllerToDomain(PartControllerDto dto);

}