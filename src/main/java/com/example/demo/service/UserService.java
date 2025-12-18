package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.model.User;
@Service
public interface UserService{
    public User register(User User);
    
    public User findByEmail(String email)
}