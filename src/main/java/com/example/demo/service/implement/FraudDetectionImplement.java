package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Claim;
import com.example.demo.model.FraudCheckResult;
import com.example.demo.model.FraudRule;
import com.example.demo.repository.ClaimRepository;
import com.example.demo.repository.FraudCheckResultRepository;
import com.example.demo.repository.FraudRuleRepository;
import com.example.demo.service.FraudDetectionService;

@Service
public class FraudDetectionServiceImpl implements FraudDetectionService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private FraudRuleRepository fraudRuleRepository;

    @Autowired
    private FraudCheckResultRepository resultRepository;

    @Override
    public FraudCheckResult evaluateClaim(Long claimId) {

        Claim claim = claimRepository.findById(claimId).orElse(null);
        boolean isFraud = false;

        List<FraudRule> rules = fraudRuleRepository.findAll();

        for (FraudRule rule : rules) {
            
            if (claim.getClaimAmount() > rule.getThresholdAmount()) {
                isFraud = true;
                break;
            }
        }

        FraudCheckResult result = new FraudCheckResult();
        result.setClaim(claim);
        result.setFraud(isFraud);

        return resultRepository.save(result);
    }

    @Override
    public FraudCheckResult getResultByClaim(Long claimId) {
        return resultRepository.findByClaimId(claimId);
    }
}
