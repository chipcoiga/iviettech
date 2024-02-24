package com.example.pr51demomvc.controller;

import com.example.pr51demomvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("aaa", service.getName1());
        model.addAttribute("bbb", service.getName2());
        model.addAttribute("ccc", service.getName3());
        service.updateDB();
        return "Home";
    }
}
