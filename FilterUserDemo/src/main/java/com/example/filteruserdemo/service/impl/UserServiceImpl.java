package com.example.filteruserdemo.service.impl;

import com.example.filteruserdemo.domain.User;
import com.example.filteruserdemo.repository.UserRepository;
import com.example.filteruserdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void filter() {
        var users = userRepository.getAll();

        for(User user : users) {
            if (user.getAge() > 10) {
                System.out.println(user.getId());
                System.out.println(user.getName());
                System.out.println(user.getAge());
                System.out.println("==============");
            }
        }
        users.stream().filter(user -> user.getAge() > 10).forEach(user -> {
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getAge());
            System.out.println("==============");
        });
    }
}
