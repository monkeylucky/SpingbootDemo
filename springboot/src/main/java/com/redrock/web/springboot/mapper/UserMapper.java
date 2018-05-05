package com.redrock.web.springboot.mapper;

import com.redrock.web.springboot.entity.UserEntity;
import org.apache.ibatis.annotations.*;


@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users(userName,passWord) VALUES(#{userName}, #{passWord})")
    @Options(useGeneratedKeys = true,keyColumn = "id")
    void insert(UserEntity user);

    @Select("SELECT * FROM users WHERE id = #{id}")
    UserEntity getUser(int id);


    @Update("UPDATE users SET `userName` = #{userName} , `passWord` = #{passWord} WHERE `id` = #{id}")
    int updateOne(UserEntity user);

}
