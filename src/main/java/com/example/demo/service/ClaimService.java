package com.example.demo.service;

import com.example.demo.model.Claim;
import java.util.List;
public interface ClaimService {
    Claim createClaim(long userId, Claim claim);
    Claim getClaim(long claimId);
}
