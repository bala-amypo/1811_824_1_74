package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Override
    public Policy createPolicy(Long userId, Policy policy) {
        return policy;
    }

    @Override
    public List<Policy> getPoliciesByUser(Long userId) {
        return new ArrayList<>();
    }
}
