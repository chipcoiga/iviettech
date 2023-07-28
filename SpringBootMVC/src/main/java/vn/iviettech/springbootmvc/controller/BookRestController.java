package vn.iviettech.springbootmvc.controller;

import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vn.iviettech.springbootmvc.domain.Book;
import vn.iviettech.springbootmvc.domain.Category;
import vn.iviettech.springbootmvc.service.BookService;
import vn.iviettech.springbootmvc.service.CategoryService;

import java.util.List;

@Validated
@RestController
@RequestMapping("books/rest")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> list() {
        return ResponseEntity.status(200)
                .body(bookService.getAllBook());
    }

    @PostMapping("{path}")
    public void create(@RequestBody Book book,
                       @PathVariable("path") String path,
                       @RequestParam("param") @Length(min = 4) @Size(min = 4) String param
                       ) {
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(path);
        System.out.println(param);
    }


}
