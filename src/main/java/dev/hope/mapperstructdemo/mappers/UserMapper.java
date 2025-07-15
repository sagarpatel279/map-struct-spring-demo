package dev.hope.mapperstructdemo.mappers;

import dev.hope.mapperstructdemo.models.User;
import dev.hope.mapperstructdemo.records.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper userMapperInstance= Mappers.getMapper(UserMapper.class);
    UserDTO userToUserDTO(User user);
    User userDtoToUser(UserDTO userDTO);
}