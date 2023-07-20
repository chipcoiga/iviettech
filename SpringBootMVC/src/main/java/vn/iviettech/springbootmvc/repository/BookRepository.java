package vn.iviettech.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iviettech.springbootmvc.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
