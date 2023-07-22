package vn.iviettech.springbootmvc.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.iviettech.springbootmvc.domain.Book;
import vn.iviettech.springbootmvc.domain.Category;
import vn.iviettech.springbootmvc.service.BookService;
import vn.iviettech.springbootmvc.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("books", bookService.getAllBook());
        return "book/list";
    }

    @GetMapping("create")
    public String showCreate(Model model) {

        List<Category> categories = categoryService.getAllCategory();
        model.addAttribute("book", new Book());
        model.addAttribute("categories", categories);

        return "book/create";
    }

    @PostMapping("create")
    public String create(@ModelAttribute @Valid Book book, Model model) {

        bookService.create(book);

        model.addAttribute("books", bookService.getAllBook());
        return "book/list";
    }
}
