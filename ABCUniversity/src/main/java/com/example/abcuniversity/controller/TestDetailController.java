package com.example.abcuniversity.controller;

import com.example.abcuniversity.entity.TestDetail;
import com.example.abcuniversity.entity.TestEntity;
import com.example.abcuniversity.service.TestDetailService;
import com.example.abcuniversity.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TestDetailController {

    @Autowired
    private TestDetailService testDetailService;
    @Autowired
    private TestService testService;

    @GetMapping("search")
    public String search(Model model,
                         @RequestParam(name = "searchText", required = false, defaultValue = "") String searchText,
                         @RequestParam(name = "testid", required = false, defaultValue = "0") int testid) {

        List<TestDetail> details = testDetailService.search(searchText, testid);
        model.addAttribute("testDetails", details);

        List<TestEntity> tests = testService.getAll();
        model.addAttribute("tests", tests);
//        model.addAttribute("select", testid);

        return "list";
    }
}
