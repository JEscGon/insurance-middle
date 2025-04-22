package com.dev.insurance_middle.infrastructure.repository.mapper;
import com.dev.generated.users.dto.UserClientDto;
import com.dev.insurance_middle.application.domain.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserDtoClientMapper {

    User fromDtoToDomain(UserClientDto userClientDto);
    UserClientDto fromDomainToDto(User user);

}
