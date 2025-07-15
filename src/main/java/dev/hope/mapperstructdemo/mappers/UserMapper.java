package dev.hope.mapperstructdemo.mappers;

import dev.hope.mapperstructdemo.models.User;
import dev.hope.mapperstructdemo.dtos.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "userId", source = "id")
    UserDTO userToUserDTO(User entity);

    @Mapping(target = "id", source = "userId")
    User useDTOtoUser(UserDTO dto);
}