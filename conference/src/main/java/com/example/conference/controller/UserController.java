package com.example.conference.controller;

import com.example.conference.model.User;
import com.example.conference.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Rafi") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Ahmed") String lastName,
                        @RequestParam(value = "age", defaultValue = "27") int age
    ) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {

        userService.save(user);

        return user;
    }
}
