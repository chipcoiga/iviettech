package com.example.springmvcshopingcart.controller;

import com.example.springmvcshopingcart.entity.CartEntity;
import com.example.springmvcshopingcart.entity.ProductEntity;
import com.example.springmvcshopingcart.service.ProductService;
import com.example.springmvcshopingcart.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService, CartEntity cartEntity) {
        this.productService = productService;
        this.cartEntity = cartEntity;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("products", productService.getAll());
        model.addAttribute("product", new ProductEntity());
        model.addAttribute("user", SecurityUtil.currentUser());
        model.addAttribute("role", SecurityUtil.getCurrentRole());
        return "product-list";
    }

    private final CartEntity cartEntity;

    @PostMapping
    public String add(@ModelAttribute ProductEntity product, Model model) {
        System.out.println("requstID" + product.getId());
        cartEntity.addItem(product);

        model.addAttribute("products", productService.getAll());
        model.addAttribute("product", new ProductEntity());
        return "product-list";
    }

//    @GetMapping("rest")
    public ResponseEntity<List<ProductEntity>> add() {
        return ResponseEntity.status(200).body(productService.getAll());
    }
}
