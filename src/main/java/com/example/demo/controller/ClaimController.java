package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.Claim;
import com.example.service.ClaimService;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    
    @PostMapping
    public Claim submitClaim(@RequestBody Claim claim) {
        return claimService.createClaim(claim);
    }

   
    @GetMapping("/{id}")
    public Claim getClaim(@PathVariable Long id) {
        return claimService.getClaim(id);
    }


    @GetMapping
    public List<Claim> getAllClaims() {
        return claimService.getAllClaims();
    }
}
