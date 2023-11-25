package service.impl;

import entity.OrderDetailEntity;
import entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.OrderDetailRepository;
import repository.OrderRepository;
import service.OrderService;

import java.util.HashSet;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveOrder(OrderEntity orderEntity, OrderDetailEntity detailEntity) throws Exception {
        //Lưu Order
        orderEntity = orderRepository.save(orderEntity);

        //Lưu Order detail
        detailEntity.setOrderEntity(orderEntity);
        orderDetailRepository.save(detailEntity);

        //throw exc
        if (orderEntity.getId() % 2 == 0) {
            throw new Exception("Id là số chẳn");
        }
    }

    @Override
    public List<OrderEntity> findAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public List<OrderEntity> findByCustomerName() {
        return orderRepository.caigicungduoc("javhd", 5);
    }
}
