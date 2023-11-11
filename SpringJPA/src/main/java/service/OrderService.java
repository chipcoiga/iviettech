package service;

import entity.OrderDetailEntity;
import entity.OrderEntity;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderEntity orderEntity, OrderDetailEntity detailEntity) throws Exception;

    List<OrderEntity> findAllOrder();

    List<OrderEntity> findByCustomerName();
}
