package service.impl;

import entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import service.CustomerService;

import java.time.LocalDateTime;
import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void createCustomer(CustomerEntity entity) {
        repository.save(entity);
    }

    @Override
    public List<CustomerEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public CustomerEntity findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<CustomerEntity> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<CustomerEntity> findByPhoneOrEmail(String phone, String email) {
        return repository.findByPhoneOrEmail(phone, email);
    }

    @Override
    public List<CustomerEntity> findBySexAndBirthdateBetween(Boolean sex, LocalDateTime from, LocalDateTime to) {
        return repository.findBySexAndBirthdateBetween(sex, from, to);
    }
}
