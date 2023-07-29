package com.example.springmvcshopingcart.controller;

import com.example.springmvcshopingcart.domain.UserModel;
import com.example.springmvcshopingcart.exception.FieldMissMatchException;
import com.example.springmvcshopingcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String index(){
        return "login";
    }

    @GetMapping("signup")
    public String signupPage(Model model) {
        model.addAttribute("user", new UserModel());
        return "register";
    }

    @PostMapping("signup")
    public String signup(@ModelAttribute("user") UserModel userModel)
            throws FieldMissMatchException {

        userService.register(userModel);
        return "redirect:/login";
    }
}
