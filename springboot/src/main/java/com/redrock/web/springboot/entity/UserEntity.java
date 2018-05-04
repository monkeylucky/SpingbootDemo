package com.redrock.web.springboot.entity;

import lombok.Data;

import javax.annotation.Generated;
import java.io.Serializable;



@Data
public class UserEntity implements Serializable {

    @Generated("")
    private int id;
    private String userName;
    private String passWord;
}
