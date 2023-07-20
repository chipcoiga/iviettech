package vn.iviettech.springbootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.iviettech.springbootmvc.service.CategoryService;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
}
