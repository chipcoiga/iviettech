package com.example.shopingcartjava51.service.impl;

import com.example.shopingcartjava51.entity.ProductEntity;
import com.example.shopingcartjava51.repository.ProductRepository;
import com.example.shopingcartjava51.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void create(ProductEntity product) {
        productRepository.save(product);
    }
}
