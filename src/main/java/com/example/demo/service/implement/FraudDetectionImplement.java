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
public class FraudDetectionImplement {

    @Autowired
    private FraudRuleRepository ruleRepository;

    @Autowired
    private FraudCheckResultRepository resultRepository;

    public FraudCheckResult evaluate(Long claimId, Double claimAmount) {

        FraudRule rule = ruleRepository.findAll().get(0);

        FraudCheckResult result = new FraudCheckResult();
        result.setClaimId(claimId);

        if (claimAmount > rule.getThresholdAmount()) {
            result.setFraud(true);
        } else {
            result.setFraud(false);
        }

        return resultRepository.save(result);
    }

    public FraudCheckResult getResult(Long claimId) {
        return resultRepository.findByClaimId(claimId);
    }
}
