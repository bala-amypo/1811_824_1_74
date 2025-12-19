package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Policy;
import com.example.repository.PolicyRepository;
import com.example.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Override
    public List<Policy> getPoliciesByUser(Long userId) {
        return policyRepository.findByUserId(userId);
    }
}
