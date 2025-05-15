package com.dev.insurance_middle.infrastructure.repository.mapper;

import com.dev.generated.policies.dto.PartClientDto;
import com.dev.insurance_middle.application.domain.Part;
import com.dev.insurance_middle.application.domain.ThirdPartyUser;
import com.dev.insurance_middle.application.domain.ThirdPartyVehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface PartDtoClientMapper {

    @Mapping(source = "accidentDate", target = "accidentDate", qualifiedByName = "mapToLocalDateTime")
    @Mapping(source = "dateOfRegistration", target = "dateOfRegistration", qualifiedByName = "mapToLocalDateTime")
    @Mapping(source = "dateOfLastUpdate", target = "dateOfLastUpdate", qualifiedByName = "mapToLocalDateTime")
    Part fromDtoToDomain(PartClientDto partClientDto);

    @Mapping(source = "accidentDate", target = "accidentDate", qualifiedByName = "mapToOffsetDateTime")
    @Mapping(source = "dateOfRegistration", target = "dateOfRegistration", qualifiedByName = "mapToOffsetDateTime")
    @Mapping(source = "dateOfLastUpdate", target = "dateOfLastUpdate", qualifiedByName = "mapToOffsetDateTime")
    PartClientDto fromDomainToDto(Part part);

    @Named("mapToOffsetDateTime")
    default OffsetDateTime mapToOffsetDateTime(LocalDateTime localDateTime) {
        return localDateTime != null ? localDateTime.atOffset(ZoneOffset.UTC) : null;
    }

    @Named("mapToLocalDateTime")
    default LocalDateTime mapToLocalDateTime(OffsetDateTime offsetDateTime) {
        return offsetDateTime != null ? offsetDateTime.toLocalDateTime() : null;
    }


}
