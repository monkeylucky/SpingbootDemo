package com.redrock.web.springboot.mapper;

import com.redrock.web.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface UserMapper {


    @Insert("INSERT INTO users(userName,passWord) VALUES(#{userName}, #{passWord})")
    @Options(useGeneratedKeys = true,keyColumn = "id" ,keyProperty = "id")
    void insert(UserEntity user);

}
