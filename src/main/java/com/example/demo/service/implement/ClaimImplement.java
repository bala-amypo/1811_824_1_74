package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Claim;
import com.example.demo.repository.ClaimRepository;
import com.example.demo.service.ClaimService;

@Service
public class ClaimImplement implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public Claim createClaim(Claim claim) {
        return claimRepository.save(claim);
    }

    @Override
    public Claim getClaim(Long claimId) {
        return claimRepository.findById(claimId).orElse(null);
    }

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }
}
