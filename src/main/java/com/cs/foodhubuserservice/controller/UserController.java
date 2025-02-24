package com.cs.foodhubuserservice.controller;


import com.cs.foodhubuserservice.entity.Items;
import com.cs.foodhubuserservice.entity.User;
import com.cs.foodhubuserservice.service.IItemService;
import com.cs.foodhubuserservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IItemService itemService;

    @Autowired
    private IUserService userService;

    @PostMapping("/save")
    public User addUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.loginUser(user);
    }

    @GetMapping("/items/all")
    public List<Items> getAllItems() {
        return itemService.fetchAllItems(); 
    }

    @GetMapping("/items/{Id}")
    public Items getItemById(@PathVariable Integer Id) {
        return itemService.fetchItemById(Id);
    }




}
