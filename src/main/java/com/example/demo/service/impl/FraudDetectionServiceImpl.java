package com.example.demo.service.impl;

import com.example.demo.model.Claim;
import com.example.demo.model.FraudCheckResult;
import com.example.demo.model.FraudRule;
import com.example.demo.repository.ClaimRepository;
import com.example.demo.repository.FraudCheckResultRepository;
import com.example.demo.repository.FraudRuleRepository;
import com.example.demo.service.FraudDetectionService;

import java.util.List;
import java.util.stream.Collectors;

public class FraudDetectionServiceImpl implements FraudDetectionService {

    private final ClaimRepository claimRepository;
    private final FraudRuleRepository fraudRuleRepository;
    private final FraudCheckResultRepository resultRepository;

    public FraudDetectionServiceImpl(ClaimRepository claimRepository,
                                     FraudRuleRepository fraudRuleRepository,
                                     FraudCheckResultRepository resultRepository) {
        this.claimRepository = claimRepository;
        this.fraudRuleRepository = fraudRuleRepository;
        this.resultRepository = resultRepository;
    }

    @Override
    public void detectFraud(Long claimId) {

        Claim claim = claimRepository.findById(claimId)
                .orElseThrow(() -> new IllegalArgumentException("Claim not found"));

        List<FraudRule> rules = fraudRuleRepository.findAll();

        String matchedRules = rules.stream()
                .map(FraudRule::getRuleName)
                .collect(Collectors.joining(","));

        FraudCheckResult result = new FraudCheckResult();
        result.setClaimId(claimId);
        result.setFraudDetected(!matchedRules.isEmpty());
        result.setMatchedRules(matchedRules);

        resultRepository.save(result);
    }
}
