package vn.iviettech.springbootmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.iviettech.springbootmvc.converter.BookConverter;
import vn.iviettech.springbootmvc.domain.Book;
import vn.iviettech.springbootmvc.entity.BookEntity;
import vn.iviettech.springbootmvc.entity.CategoryEntity;
import vn.iviettech.springbootmvc.repository.BookRepository;
import vn.iviettech.springbootmvc.repository.CategoryRepository;
import vn.iviettech.springbootmvc.service.BookService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Transactional
    public List<Book> getAllBook() {
        List<BookEntity> bookEntities = bookRepository.findAll();
        bookEntities.get(2).setName("yyyyyyy");
        bookRepository.save(bookEntities.get(2));
        bookEntities.get(2).setName("xxxxxxxxxxxxx");
        return bookEntities.stream().map(BookConverter::toModel)
                .collect(Collectors.toList());
    }

//    @Transactional
    public void testX() {
        BookEntity entity = bookRepository.findById(4L).get();
        System.out.println(entity.getName());
        entity.setName("nnnnn");
//        bookRepository.save(entity);
    }

    @Override
    public void create(Book book) {
        BookEntity entity = convertToEntity(book);
        bookRepository.save(entity);
    }

    private BookEntity convertToEntity(Book book) {
        BookEntity entity = BookConverter.toEntity(book);
        CategoryEntity categoryEntity = categoryRepository.findById(book.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Khong tim thay category"));
        entity.setCategoryEntity(categoryEntity);
        return entity;
    }
}
