package vn.iviettech.springbootmvc.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.NonNull;
import vn.iviettech.springbootmvc.entity.BookDetailEntity;
import vn.iviettech.springbootmvc.entity.CategoryEntity;

public class Book {
    private Long id;
    private String author;
//    @Pattern(regexp = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$")
    private String name;
    private Long categoryId;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
