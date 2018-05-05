package com.redrock.web.springboot.service;

import com.redrock.web.springboot.entity.UserEntity;
import com.redrock.web.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(UserEntity user) {
        userMapper.insert(user);
    }

    public UserEntity getUser(int id){
        return userMapper.getUser(id);
    }


    public int updateOne(UserEntity user){
        return userMapper.updateOne(user);
    }
}
