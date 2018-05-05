package com.redrock.web.springboot.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class UserEntity implements Serializable {
    private int id;
    private String userName;
    private String passWord;
}
