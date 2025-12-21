package com.example.demo.service.implement;

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
public class FraudDetectionImplement implements FraudDetectionService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private FraudRuleRepository fraudRuleRepository;

    @Autowired
    private FraudCheckResultRepository fraudCheckResultRepository;

    @Override
    public FraudCheckResult checkFraud(Long claimId) {

        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new RuntimeException("Claim not found"));

        List<FraudRule> rules = fraudRuleRepository.findAll();

        FraudCheckResult result = new FraudCheckResult();
        result.setClaimId(claimId);

        boolean fraud = false;

        for (FraudRule rule : rules) {
            if (claim.getAmount() > rule.getThresholdAmount()) {
                fraud = true;
                break;
            }
        }

        // ✅ ONLY VALID METHOD
        result.setFraud(fraud);

        return fraudCheckResultRepository.save(result);
    }
}
