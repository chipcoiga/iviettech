package com.example.abcuniversity.service.impl;

import com.example.abcuniversity.entity.TestEntity;
import com.example.abcuniversity.repository.TestRepository;
import com.example.abcuniversity.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository repository;

    @Override
    public List<TestEntity> getAll() {

        return repository.findAll();
    }
}
