package quandaica.com.demoforquan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quandaica.com.demoforquan.entity.OrderDetailEntity;

public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {
}
