package com.cs.foodhubuserservice.service;

import com.cs.foodhubuserservice.client.ItemClient;
import com.cs.foodhubuserservice.entity.User;
import com.cs.foodhubuserservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private ItemClient itemClient;

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {

        return userRepository.save(user);
    }



    public User loginUser(User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser.isPresent()) {
            User storedUser = existingUser.get();
            // Compare passwords (No encryption)
            if (user.getPassword().equals(storedUser.getPassword())) {
                return storedUser; // Login successful
            } else {
                throw new RuntimeException("Invalid password");
            }
        } else {
            throw new RuntimeException("User not found");
        }
    }

}

