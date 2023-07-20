package vn.iviettech.springbootmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.iviettech.springbootmvc.converter.UserConverter;
import vn.iviettech.springbootmvc.domain.User;
import vn.iviettech.springbootmvc.entity.UserEntity;
import vn.iviettech.springbootmvc.repository.UserRepository;
import vn.iviettech.springbootmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Long createUser(User user) {
        return userRepository.save(UserConverter.toEntity(user)).getId();
    }
}
