package vn.iviettech.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.iviettech.springbootmvc.domain.Book;
import vn.iviettech.springbootmvc.entity.BookEntity;
import vn.iviettech.springbootmvc.entity.CategoryEntity;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

    List<BookEntity> findByAuthorContainingAndCategoryEntity(
            String searchText,
            CategoryEntity category);
}
