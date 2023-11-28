package com.example.shopingcartjava51.controller;

import com.example.shopingcartjava51.entity.ProductEntity;
import com.example.shopingcartjava51.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("products")
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String showProducts(Model model) {

        List<ProductEntity> products = productService.getAllProduct();
        model.addAttribute("products", products);

        return "product/list";
    }

    @GetMapping("create-page")
    public String showCreateProductPage(Model model) {

        model.addAttribute("product", new ProductEntity());

        return "product/add";
    }

    @PostMapping
    public String addProducts(@ModelAttribute ProductEntity product, Model model) {

        productService.create(product);

        // Show list
        List<ProductEntity> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "product/list";
    }
}
