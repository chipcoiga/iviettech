package quandaica.com.demoforquan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quandaica.com.demoforquan.entity.ProductEntity;
import quandaica.com.demoforquan.repository.ProductRepository;
import quandaica.com.demoforquan.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<ProductEntity> getAll() {
        return repository.findAll();
    }
}
