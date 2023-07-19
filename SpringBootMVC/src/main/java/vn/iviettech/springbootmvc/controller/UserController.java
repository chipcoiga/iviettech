package vn.iviettech.springbootmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.iviettech.springbootmvc.domain.User;
import vn.iviettech.springbootmvc.service.UserService;

@RequestMapping("users")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{userId}")
    public String getUserDetail(
            @PathVariable(name = "userId") Long userId,
            Model model) {

        User user = getUser(userId);

        model.addAttribute("user", user);

        return "user/detail";
    }

    @GetMapping("register")
    public String register(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "user/create";
    }

    @PostMapping("register")
    public String createUser(@ModelAttribute User user, Model model) {

        Long id = userService.createUser(user);

        user.setId(id);
        model.addAttribute("user", user);
        return "user/detail";
    }

    private User getUser(Long userId) {
        User user = new User();
        user.setId(userId);
        user.setName("Name" + userId);
        user.setAge(10);
        return user;
    }
}
