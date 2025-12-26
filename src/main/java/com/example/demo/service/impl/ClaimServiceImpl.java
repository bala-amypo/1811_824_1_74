package com.example.demo.service;

import com.example.demo.model.Claim;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Override
    public Claim submitClaim(Claim claim) {
        return claim;
    }

    @Override
    public List<Claim> getClaimsByUser(Long userId) {
        return new ArrayList<>();
    }
}
