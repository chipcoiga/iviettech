package com.example.shopingcartjava51.repository;

import com.example.shopingcartjava51.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
