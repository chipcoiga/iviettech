package vn.iviettech.springbootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.iviettech.springbootmvc.domain.Book;
import vn.iviettech.springbootmvc.service.BookService;
import vn.iviettech.springbootmvc.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("{categoryId}/books")
    public String searchBook(
            @PathVariable(name = "categoryId") Long categoryId,
            @RequestParam(name = "author") String searchText,
            Model model) {

        List<Book> searchBooks = bookService.searchBook(categoryId, searchText);
        model.addAttribute("books", searchBooks);
        return "book/list";
    }
}
