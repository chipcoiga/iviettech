package com.example.filteruserdemo.repository.impl;

import com.example.filteruserdemo.domain.User;
import com.example.filteruserdemo.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> getAll() {

        User u1 = new User();
        u1.setId(1);
        u1.setName("User1");
        u1.setAge(9);

        User u2 = new User();
        u2.setId(2);
        u2.setName("User2");
        u2.setAge(10);

        var u3 = new User();
        u3.setId(3);
        u3.setName("User3");
        u3.setAge(11);

        return List.of(u1, u2, u3);
    }
}
