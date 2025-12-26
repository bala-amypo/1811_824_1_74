package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.model.FraudRule;

@Service
public class FraudRuleService {

    public List<FraudRule> getAllRules() {
        // Return empty list for now
        return List.of();
    }
}
