package com.example.demo.service;

import com.example.demo.model.Policy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
