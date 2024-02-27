package com.example.pr51demomvc.controller;

import com.example.pr51demomvc.entity.HomeEntity;
import com.example.pr51demomvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("home")
@Controller
public class HomeController {

    @Autowired
    private HomeService service;

//    @GetMapping
//    public String home(Model model) {
//        model.addAttribute("aaa", service.getName1());
//        model.addAttribute("bbb", service.getName2());
//        model.addAttribute("ccc", service.getName3());
////        model.addAttribute("cartentity", cartentity);
//        service.updateDB();
//        return "Home";
//    }

    @GetMapping
    public String showCreateHome(Model model) {
        model.addAttribute("home", new HomeEntity());
        return "createHome";
    }

    @PostMapping
    public String showCreateHome(HomeEntity homeEntity, Model model) {

        //Lưu DB
        service.save(homeEntity);

        HomeEntity home = service.getLatestHome();
        model.addAttribute("aaa", home.getName1());
        model.addAttribute("bbb", home.getName2());
        model.addAttribute("ccc", home.getName3());
        return "Home";
    }

}
