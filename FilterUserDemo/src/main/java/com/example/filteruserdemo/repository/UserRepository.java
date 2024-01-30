package com.example.filteruserdemo.repository;

import com.example.filteruserdemo.domain.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();
}
