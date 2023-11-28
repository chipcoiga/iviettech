package com.example.shopingcartjava51.controller;

import com.example.shopingcartjava51.domain.CartEntity;
import com.example.shopingcartjava51.entity.ProductEntity;
import com.example.shopingcartjava51.remote.ProductRemoteService;
import com.example.shopingcartjava51.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest")
public class RestChuaCoData {

    @Autowired
    private ProductRemoteService remoteService;

    @GetMapping("/demo-cho-vui")
    public ProductEntity demo() {
        ProductEntity entity = new ProductEntity();
        entity.setName("hehehe");
        entity.setDescription("Demo rest");
        entity.setPrice(100);
        return entity;
    }

//    @GetMapping("/products")
//    public List<ProductEntity> showAllProducts() {
//        return productService.getAllProduct();
//    }

    @PostMapping("/products")
    public void createProductEntity(
            @RequestBody ProductEntity entity) {
        System.out.println("Dang o 8080");
        remoteService.create(entity);
    }
}
