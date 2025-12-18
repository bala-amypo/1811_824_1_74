package com.example.service;

import com.example.demo.model.FraudCheckResult;

public interface FraudDetectionService {
    FraudCheckResult evaluateClaim(Long claimId);
    FraudCheckResult getResultByClaim(Long claimId);
}
