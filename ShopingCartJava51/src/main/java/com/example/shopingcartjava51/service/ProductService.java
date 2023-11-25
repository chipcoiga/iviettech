package com.example.shopingcartjava51.service;

import com.example.shopingcartjava51.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProduct();

    void create(ProductEntity product);
}
