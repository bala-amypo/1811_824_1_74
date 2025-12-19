package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.FraudRule;
import com.example.repository.FraudRuleRepository;
import com.example.service.FraudRuleService;

@Service
public class FraudRuleServiceImpl implements FraudRuleService {

    @Autowired
    private FraudRuleRepository fraudRuleRepository;

    @Override
    public FraudRule addRule(FraudRule rule) {
        return fraudRuleRepository.save(rule);
    }

    @Override
    public List<FraudRule> getAllRules() {
        return fraudRuleRepository.findAll();
    }
}
