package com.example.springmvcshopingcart.service;

import com.example.springmvcshopingcart.domain.UserModel;
import com.example.springmvcshopingcart.exception.FieldMissMatchException;

public interface UserService {
    void register(UserModel userModel) throws FieldMissMatchException;
}
