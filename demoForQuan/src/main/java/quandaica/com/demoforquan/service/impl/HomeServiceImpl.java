package quandaica.com.demoforquan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quandaica.com.demoforquan.entity.HomeEntity;
import quandaica.com.demoforquan.repository.HomeRepository;
import quandaica.com.demoforquan.service.HomeService;

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
