package com.example.springmvcshopingcart.validator;

import com.example.springmvcshopingcart.domain.UserModel;
import com.example.springmvcshopingcart.exception.FieldMissMatchException;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UserRegisterValidator {

    public void validateRegisterUser(UserModel userModel)
            throws FieldMissMatchException {

        if (!Objects.equals(userModel.getPassword(), userModel.getRePassword())) {
            throw new FieldMissMatchException("Password miss match");
        }
    }
}
