package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User register(User user) {
        return user; // dummy save for test case
    }

    @Override
    public String login(String email, String password) {
        if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
            return "Login Successful";
        }
        return "Invalid Credentials";
    }
}
