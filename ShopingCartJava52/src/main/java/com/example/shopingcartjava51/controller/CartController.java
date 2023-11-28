package com.example.shopingcartjava51.controller;

import com.example.shopingcartjava51.domain.CartHolder;
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

@RequestMapping("cart")
@Controller
public class CartController {

    @Autowired
    private CartHolder cartHolder;

    @Autowired
    private ProductService productService;

    @GetMapping
    public String showCart(Model model) {
        model.addAttribute("cart", cartHolder);
        return "cart/list";
    }

    @PostMapping
    public String addToCart(@ModelAttribute ProductEntity product, Model model) {

        cartHolder.addToCart(product);

        // Show list
        List<ProductEntity> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "product/list";
    }
}
