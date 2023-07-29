package com.example.springmvcshopingcart.convertor;

import com.example.springmvcshopingcart.domain.UserModel;
import com.example.springmvcshopingcart.entity.UserEntity;

public class UserConvertor {

    public static UserEntity toEntity(UserModel userModel) {
        UserEntity entity = new UserEntity();
        entity.setUsername(userModel.getUsername());
        entity.setPassword(userModel.getPassword());
        entity.setRole("ROLE_USER");
        return entity;
    }
}
