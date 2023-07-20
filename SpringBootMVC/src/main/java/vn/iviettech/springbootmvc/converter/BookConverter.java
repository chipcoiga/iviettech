package vn.iviettech.springbootmvc.converter;

import vn.iviettech.springbootmvc.domain.Book;
import vn.iviettech.springbootmvc.entity.BookEntity;

public class BookConverter {

    public static Book toModel(BookEntity entity) {
        Book book = new Book();
        book.setId(entity.getId());
        book.setAuthor(entity.getAuthor());
        book.setName(entity.getName());
        book.setCategoryId(entity.getCategoryEntity().getId());
        return book;
    }

    public static BookEntity toEntity(Book book) {
        BookEntity entity = new BookEntity();
        entity.setName(book.getName());
        entity.setAuthor(book.getAuthor());
        return entity;
    }
}
