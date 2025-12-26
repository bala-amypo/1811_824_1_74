package com.example.demo.service;

import com.example.demo.model.Policy;

public interface PolicyService {
    Policy createPolicy(Long userId, Policy policy);
}
