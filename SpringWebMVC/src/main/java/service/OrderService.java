package service;

import entity.OrderDetailEntity;
import entity.OrderEntity;

public interface OrderService {
    void saveOrder(OrderEntity orderEntity, OrderDetailEntity detailEntity) throws Exception;
}
