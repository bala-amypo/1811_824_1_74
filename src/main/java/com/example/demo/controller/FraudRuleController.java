package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.FraudRule;
import com.example.demo.service.FraudRuleService;

@RestController
@RequestMapping("/api/rules")
public class FraudRuleController {

    @Autowired
    private FraudRuleService fraudRuleService;

    
    @PostMapping
    public FraudRule addRule(@RequestBody FraudRule rule) {
        return fraudRuleService.addRule(rule);
    }

    
    @GetMapping
    public List<FraudRule> getAllRules() {
        return fraudRuleService.getAllRules();
    }
}
