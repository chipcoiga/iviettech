package vn.iviettech.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iviettech.springbootmvc.entity.BookDetailEntity;

public interface BookDetailRepository extends JpaRepository<BookDetailEntity, Long> {
}
