package vn.iviettech.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iviettech.springbootmvc.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
