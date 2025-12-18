package com.example.service;

import java.util.List;
import com.example.demo.model.Claim;

public interface ClaimService {
    Claim createClaim(Claim claim);
    Claim getClaim(Long claimId);
    List<Claim> getAllClaims();
}
