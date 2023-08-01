package com.example.springmvcshopingcart.service.impl;

import com.example.springmvcshopingcart.convertor.UserConvertor;
import com.example.springmvcshopingcart.domain.UserModel;
import com.example.springmvcshopingcart.entity.UserEntity;
import com.example.springmvcshopingcart.exception.FieldMissMatchException;
import com.example.springmvcshopingcart.repository.UserRepository;
import com.example.springmvcshopingcart.service.UserService;
import com.example.springmvcshopingcart.validator.UserRegisterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRegisterValidator validator;


    @Transactional
    @Override
    public void register(UserModel userModel) throws FieldMissMatchException {
        validator.validateRegisterUser(userModel);
        UserEntity entity = UserConvertor.toEntity(userModel);
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        repository.save(entity);
    }

    @Override
    public String averageMathAlphabet(int math, int physical) {//8, 7 => ket qua == 7.5?
       float average = (math + physical)/2.0f;

       if (math < 0 || physical < 0) {
           throw new RuntimeException();
       }

        if (math > 10 || physical > 10) {
            throw new RuntimeException();
        }

       if (average >= 8) {
           return "A";
       }

        if (6 <= average) {
            return "B";
        }

        if (0 <= average && average < 4) {
            return "D";
        }

        return "";
    }


}
