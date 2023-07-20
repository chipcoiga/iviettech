package vn.iviettech.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iviettech.springbootmvc.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
