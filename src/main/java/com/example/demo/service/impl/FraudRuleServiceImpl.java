package com.example.demo.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.FraudRule;
import com.example.demo.service.FraudRuleService;

@Service
public class FraudRuleServiceImpl implements FraudRuleService {

    @Override
    public FraudRule addRule(FraudRule rule) {
        return rule; // dummy save
    }

    @Override
    public List<FraudRule> getAllRules() {
        return List.of();
    }
}
