package com.example.demo.service.implement;

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
public class FraudDetectionImplement implements FraudDetectionService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private FraudRuleRepository fraudRuleRepository;

    @Autowired
    private FraudCheckResultRepository resultRepository;

    @Override
    public FraudCheckResult evaluateClaim(Long claimId) {

        Claim claim = claimRepository.findById(claimId).orElse(null);
        boolean fraud = false;

        for (FraudRule rule : fraudRuleRepository.findAll()) {
            if (claim.getClaimAmount() > rule.getThresholdAmount()) {
                fraud = true;
                break;
            }
        }

        FraudCheckResult result = new FraudCheckResult();
        result.setClaim(claim);
        result.setFraud(fraud);

        return resultRepository.save(result);
    }

    @Override
    public FraudCheckResult getResultByClaim(Long claimId) {
        return resultRepository.findByClaimId(claimId);
    }
}
