package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
imoport com.example.demo.model.User;
import com.example.demo.model.Policy;
import com.example.demo.repository.PolicyRepository;
import com.example.demo.service.PolicyService;

@Service
public class PolicyImplement implements PolicyService {

    @Autowired
    PolicyRepository policyRepository;
    User obj;
    @Override
    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Override
    // public List<Policy> getPoliciesByUser(Long userId) {
        
    // }
}
