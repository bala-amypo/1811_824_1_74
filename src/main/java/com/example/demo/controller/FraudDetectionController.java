package com.example.demo.controller;

import com.example.demo.model.FraudCheckResult;
import com.example.demo.service.FraudDetectionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud-check")
public class FraudDetectionController {

    private final FraudDetectionService fraudDetectionService;

    // Constructor Injection (as required)
    public FraudDetectionController(FraudDetectionService fraudDetectionService) {
        this.fraudDetectionService = fraudDetectionService;
    }

    // -------------------------------------------------
    // POST: Evaluate a claim for fraud
    // URL: /api/fraud-check/evaluate/{claimId}
    // -------------------------------------------------
    @PostMapping("/evaluate/{claimId}")
    public FraudCheckResult evaluateClaim(@PathVariable Long claimId) {
        return fraudDetectionService.evaluateClaim(claimId);
    }

    // -------------------------------------------------
    // GET: Get fraud result for a claim
    // URL: /api/fraud-check/result/claim/{claimId}
    // -------------------------------------------------
    @GetMapping("/result/claim/{claimId}")
    public FraudCheckResult getResultByClaim(@PathVariable Long claimId) {
        return fraudDetectionService.getResultByClaim(claimId);
    }
}
