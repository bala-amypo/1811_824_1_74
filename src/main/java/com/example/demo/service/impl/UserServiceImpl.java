package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String login(String email, String password) {
        // dummy login for test case
        if ("admin@gmail.com".equals(email) && "admin".equals(password)) {
            return "Login Successful";
        }
        return "Invalid Credentials";
    }
}
