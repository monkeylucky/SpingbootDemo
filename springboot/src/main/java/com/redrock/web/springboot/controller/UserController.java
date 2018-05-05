package com.redrock.web.springboot.controller;


import com.redrock.web.springboot.entity.UserEntity;
import com.redrock.web.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void add(UserEntity user) {
        userService.insertUser(user);
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public UserEntity get(int id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int updateOne(UserEntity user){
        return userService.updateOne(user);
    }


}
