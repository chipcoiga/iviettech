package quandaica.com.demoforquan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quandaica.com.demoforquan.entity.HomeEntity;

public interface HomeRepository extends JpaRepository<HomeEntity, Long> {
}
