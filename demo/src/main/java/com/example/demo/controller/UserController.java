package com.example.demo.controller;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String getUser(Model model) {
        User user = new User();

        model.addAttribute("user", user);
        return "user_login";
    }

    @PostMapping("/login")
    public String postUser(@Valid @ModelAttribute("user") User user, Errors errors, Model model) {

        if (errors.hasErrors())
            return "user_login";
        return "home";
    }
}


