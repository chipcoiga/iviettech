package quandaica.com.demoforquan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quandaica.com.demoforquan.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
