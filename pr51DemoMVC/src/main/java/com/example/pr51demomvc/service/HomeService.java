package com.example.pr51demomvc.service;

import com.example.pr51demomvc.entity.HomeEntity;

public interface HomeService {

    String getName1();

    String getName2();

    String getName3();

    void updateDB();

    void save(HomeEntity homeEntity);

    HomeEntity getLatestHome();
}
