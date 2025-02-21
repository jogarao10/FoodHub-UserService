package com.cs.foodhubuserservice.service;

import com.cs.foodhubuserservice.entity.User;
import com.cs.foodhubuserservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {

        return userRepository.save(user);
    }

}

