package service;

import entity.CustomerEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface CustomerService {
    void createCustomer(CustomerEntity entity);
    List<CustomerEntity> findAll();
    CustomerEntity findById(Long id);
    List<CustomerEntity> findByName(String name);
    List<CustomerEntity> findByPhoneOrEmail(String phone, String email);
    List<CustomerEntity> findBySexAndBirthdateBetween(Boolean sex, LocalDateTime from, LocalDateTime to);
}
