package com.example.demo.service;

import com.example.demo.model.Claim;
import java.util.List;

public interface ClaimService {

    Claim submitClaim(Claim claim);

    List<Claim> getClaimsByUser(Long userId);
}
