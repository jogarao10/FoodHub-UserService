package com.cs.foodhubuserservice.controller;

import com.cs.foodhubuserservice.entity.User;
import com.cs.foodhubuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password) {
        return userService.loginUser(email, password);
    }
}
