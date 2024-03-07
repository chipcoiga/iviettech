package quandaica.com.demoforquan.service;

import quandaica.com.demoforquan.entity.ProductEntity;

import java.util.Map;

public interface CartService {
    void addToCart(Long productId);

    Map<ProductEntity, Integer> getCart();

    void createOrder();
}
