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
}
