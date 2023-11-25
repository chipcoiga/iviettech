package com.example.shopingcartjava51.domain;

import com.example.shopingcartjava51.entity.ProductEntity;

public class CartEntity {
    private ProductEntity productEntity;
    private Integer amount = 0;

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
