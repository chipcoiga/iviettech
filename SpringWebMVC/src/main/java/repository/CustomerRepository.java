package repository;

import entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    List<CustomerEntity> findByName(String name);
    List<CustomerEntity> findByPhoneOrEmail(String phone, String email);
    List<CustomerEntity> findBySexAndBirthdateBetween(Boolean sex, LocalDateTime from, LocalDateTime to);
}
