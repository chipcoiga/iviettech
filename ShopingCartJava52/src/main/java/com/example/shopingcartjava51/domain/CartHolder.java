package com.example.shopingcartjava51.domain;

import com.example.shopingcartjava51.entity.ProductEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Scope(scopeName = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CartHolder {

    List<CartEntity> cartEntities = new ArrayList<>();

    public List<CartEntity> getCartEntities() {
        return cartEntities;
    }

    public void addToCart(ProductEntity product) {

        CartEntity cartEntity = cartEntities.stream()
                .filter(
                        entity -> Objects.equals(entity.getProductEntity()
                                .getId(), product.getId()))
                .findFirst().orElse(new CartEntity());

        if (cartEntity.getAmount() <= 0) {
            cartEntity.setProductEntity(product);
            cartEntity.setAmount(1);
            cartEntities.add(cartEntity);
            print();
            return;
        }

        cartEntity.setAmount(cartEntity.getAmount() + 1);
        print();
    }

    private void print() {
        cartEntities.forEach(item -> {
            System.out.println("Amount: " + item.getAmount());
            System.out.println("ProductID: " + item.getProductEntity().getId());
        });
    }
}
