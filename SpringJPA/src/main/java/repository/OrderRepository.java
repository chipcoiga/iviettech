package repository;

import entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    List<OrderEntity> findByCustomerName(String customerName);
    List<OrderEntity> findByCustomerNameContains(String customerName);
    List<OrderEntity> findByCustomerNameContainsAndIdLessThan(String customerName, int id);

    @Query(value = "select * from OrderEntity o " +
            "where o.customerName like ?1 " +
            "and o.id <= ?2", nativeQuery = true)
    List<OrderEntity> caigicungduoc(String customerName, int id);

    @Query(value = "select o from OrderEntity o " +
            "where o.customerName like ?1 " +
            "and o.id <= ?2")
    List<OrderEntity> caigicungkoduoc(String customerName, int id);
}
