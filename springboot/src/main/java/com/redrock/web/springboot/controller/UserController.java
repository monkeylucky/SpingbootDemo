package com.redrock.web.springboot.controller;


import com.redrock.web.springboot.entity.UserEntity;
import com.redrock.web.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void save(UserEntity user) {
        userMapper.insert(user);
    }


}
