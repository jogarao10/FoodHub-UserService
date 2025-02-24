package com.cs.foodhubuserservice.service;

import com.cs.foodhubuserservice.entity.User;



public interface IUserService {
    public User registerUser(User user);
    public User loginUser(User user);

}
