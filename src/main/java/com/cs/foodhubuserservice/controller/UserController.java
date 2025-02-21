package com.cs.foodhubuserservice.controller;


import com.cs.foodhubuserservice.entity.User;
import com.cs.foodhubuserservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/save")
    public User addUser(@RequestBody User user) {
        return userService.registerUser(user);
    }




}
