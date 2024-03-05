package quandaica.com.demoforquan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quandaica.com.demoforquan.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
