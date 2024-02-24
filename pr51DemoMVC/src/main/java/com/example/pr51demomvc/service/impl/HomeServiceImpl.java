package com.example.pr51demomvc.service.impl;

import com.example.pr51demomvc.entity.HomeEntity;
import com.example.pr51demomvc.repository.HomeRepository;
import com.example.pr51demomvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeRepository repository;

    @Override
    public String getName1() {
        return findOne().getName1();
    }

    @Override
    public String getName2() {
        return findOne().getName2();
    }

    @Override
    public String getName3() {
        return findOne().getName3();
    }

    @Transactional
    @Override
    public void updateDB() {
        HomeEntity entity = repository.findById(2L).orElseThrow();
        entity.setName1("Ly da tap trung tro lai");

        HomeEntity entity1 = repository.findById(2L).orElseThrow();
        entity1.setName1("Ly da tap trung tro lai");
    }

    private HomeEntity findOne() {
        return repository.findAll().get(0);
    }
}
