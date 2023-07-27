package com.example.springmvcshopingcart.service.impl;

import com.example.springmvcshopingcart.entity.ProductEntity;
import com.example.springmvcshopingcart.repository.ProductRepository;
import com.example.springmvcshopingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductEntity> getAll() {
        return repository.findAll();
    }
}
