package dev.hope.mapperstructdemo.controllers;

import dev.hope.mapperstructdemo.mappers.UserMapper;
import dev.hope.mapperstructdemo.models.User;
import dev.hope.mapperstructdemo.dtos.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converts")
public class MapperDemoController {
    private UserMapper userMapper;
    public MapperDemoController(UserMapper userMapper){
        this.userMapper=userMapper;
    }

    @GetMapping("/user")
    public UserDTO getUserDTO(@RequestBody User user){
        return userMapper.userToUserDTO(user);
    }

    @GetMapping("/userdto")
    public User getUser(@RequestBody UserDTO userDTO){
        return userMapper.useDTOtoUser(userDTO);
    }

}
