package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.model.FraudCheckResult;
import com.example.demo.service.FraudDetectionService;

@Service
public class FraudDetectionServiceImpl implements FraudDetectionService {

    @Override
    public FraudCheckResult evaluateClaim(Long claimId) {
        FraudCheckResult result = new FraudCheckResult();
        result.setClaimId(claimId);
        result.setRiskLevel("LOW");
        result.setStatus("EVALUATED");
        return result;
    }

    @Override
    public FraudCheckResult getResultByClaim(Long claimId) {
        FraudCheckResult result = new FraudCheckResult();
        result.setClaimId(claimId);
        result.setRiskLevel("LOW");
        result.setStatus("COMPLETED");
        return result;
    }
}
