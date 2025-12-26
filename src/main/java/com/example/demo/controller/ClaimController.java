package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Claim;
import com.example.demo.service.ClaimService;

@RestController
@RequestMapping("/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @PostMapping
    public Claim submitClaim(@RequestBody Claim claim) {
        return claimService.submitClaim(claim);
    }

    @GetMapping("/user/{userId}")
    public List<Claim> getClaimsByUser(@PathVariable Long userId) {
        return claimService.getClaimsByUser(userId);
    }
}
