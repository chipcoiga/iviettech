package vn.iviettech.springbootmvc.service;

import vn.iviettech.springbootmvc.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBook();

    void create(Book book);

    List<Book> searchBook(Long categoryId, String searchText);
}
