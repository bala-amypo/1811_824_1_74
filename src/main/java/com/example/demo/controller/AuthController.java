package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    
    @PostMapping("/login")
    public User login(@RequestParam String email) {
        return userService.findByEmail(email);
    }
}
