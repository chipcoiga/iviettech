package com.example.springmvcshopingcart.controller;

import com.example.springmvcshopingcart.entity.CartEntity;
import com.example.springmvcshopingcart.entity.ProductEntity;
import com.example.springmvcshopingcart.remote.RemoteService;
import com.example.springmvcshopingcart.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    private final ProductService productService;
    private final RemoteService remoteService;

    public ProductRestController(ProductService productService,
                                 RemoteService remoteService) {
        this.productService = productService;
        this.remoteService = remoteService;
    }


    @GetMapping("products/rest")
    public List<ProductEntity> getProduct() {
        return productService.getAll();
    }

    @GetMapping("remmote")
    public List<ProductEntity> getProductFromRemote() {
        return remoteService.getProductFromOtherClient();
    }
}
