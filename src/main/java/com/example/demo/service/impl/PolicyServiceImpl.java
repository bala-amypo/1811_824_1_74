package com.example.demo.service;

import com.example.demo.model.Policy;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Override
    public Policy createPolicy(Long userId, Policy policy) {
        return policy;
    }
}
