package com.example.pr51demomvc.repository;

import com.example.pr51demomvc.entity.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<HomeEntity, Long> {
}
