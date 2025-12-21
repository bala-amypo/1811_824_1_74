package com.example.demo.service;

import com.example.demo.model.FraudCheckResult;

public interface FraudDetectionService {
    FraudCheckResult checkFraud(Long claimId);
}
