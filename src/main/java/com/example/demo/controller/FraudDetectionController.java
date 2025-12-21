package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.FraudCheckResult;
import com.example.demo.service.FraudDetectionService;

@RestController
@RequestMapping("/api/fraud-check")
public class FraudDetectionController {

    @Autowired
    private FraudDetectionService fraudDetectionService;

    // POST /api/fraud-check/evaluate/{claimId}
    @PostMapping("/evaluate/{claimId}")
    public FraudCheckResult evaluateClaim(@PathVariable Long claimId) {
        return fraudDetectionService.evaluateClaim(claimId);
    }

    // GET /api/fraud-check/result/claim/{claimId}
    @GetMapping("/result/claim/{claimId}")
    public FraudCheckResult getResult(@PathVariable Long claimId) {
        return fraudDetectionService.getResultByClaim(claimId);
    }
}
