package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Claim;
import com.example.demo.model.Policy;
import com.example.demo.repository.ClaimRepository;
import com.example.demo.repository.PolicyRepository;
import com.example.demo.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private PolicyRepository policyRepository;

    // ✅ REQUIRED BY TESTS
    public ClaimServiceImpl() {
    }

    @Override
    public Claim createClaim(Long policyId, Claim claim) {
        Policy policy = policyRepository.findById(policyId).orElse(null);
        claim.setPolicy(policy);
        return claimRepository.save(claim);
    }

    @Override
    public Claim getClaim(Long id) {
        return claimRepository.findById(id).orElse(null);
    }
}
