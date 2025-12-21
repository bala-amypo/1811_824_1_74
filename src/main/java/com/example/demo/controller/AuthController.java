package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import java.util.List;
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }


    @PostMapping("/{email}")
    public User login(@PathVariable String email) {
        return userService.findByEmail(email);
    }
}
