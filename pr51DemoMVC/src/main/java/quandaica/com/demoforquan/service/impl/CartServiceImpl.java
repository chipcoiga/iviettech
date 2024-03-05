package quandaica.com.demoforquan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quandaica.com.demoforquan.beans.CartEntity;
import quandaica.com.demoforquan.entity.OrderDetailEntity;
import quandaica.com.demoforquan.entity.OrderEntity;
import quandaica.com.demoforquan.entity.ProductEntity;
import quandaica.com.demoforquan.repository.OrderDetailRepository;
import quandaica.com.demoforquan.repository.OrderRepository;
import quandaica.com.demoforquan.repository.ProductRepository;
import quandaica.com.demoforquan.service.CartService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartEntity cartEntity;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailRepository detailRepository;

    @Override
    public void addToCart(Long productId) {
        cartEntity.addToCart(productId);
    }

    @Override
    public Map<ProductEntity, Integer> getCart() {

        Map<Long, Integer> cart = cartEntity.getCart();

        List<ProductEntity> productEntities = productRepository.findAllById(cart.keySet());

        //Convert list to hashmap
        Map<Long, ProductEntity> productEntityMap = productEntities.stream()
                .collect(Collectors.toMap(ProductEntity::getId, Function.identity()));

        //Normal way
//        Map<Long, ProductEntity> productEntityMap1 = new HashMap<>();
//        productEntities.forEach(item -> {
//            productEntityMap1.put(item.getId(), item);
//        });

        Map<ProductEntity, Integer> productEntityIntegerMap = new HashMap<>();

        //Chuyen thanh map cart
        productEntityMap.keySet().forEach(key -> {
            ProductEntity entity = productEntityMap.get(key);
            Integer amount = cart.get(key);
            productEntityIntegerMap.put(entity, amount);
        });

        return productEntityIntegerMap;
    }

    @Override
    public void createOrder() {
        Map<Long, Integer> cart = cartEntity.getCart();

        Map<Long, ProductEntity> productEntityMap = productRepository.findAllById(cart.keySet())
                .stream()
                .collect(Collectors.toMap(ProductEntity::getId, Function.identity()));

        //Create Order
        OrderEntity order = new OrderEntity();
        order.setOrderDate(LocalDateTime.now());
        order.setCustomerName("Loc Le");
        order.setCustomerName("Loc Le Address");
        order = orderRepository.save(order);

        //Create all Order detail in Order
        OrderEntity finalOrder = order;
        cart.forEach((k, v) -> {
            OrderDetailEntity detailEntity = new OrderDetailEntity();
            detailEntity.setProduct(productEntityMap.get(k));
            detailEntity.setQuantity(v);
            detailEntity.setOrder(finalOrder);
            detailRepository.save(detailEntity);
        });
    }


}
