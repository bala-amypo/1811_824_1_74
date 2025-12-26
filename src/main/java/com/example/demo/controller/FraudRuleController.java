package com.example.demo.controller;

import com.example.demo.model.FraudRule;
import com.example.demo.service.FraudRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class FraudRuleController {

    private final FraudRuleService fraudRuleService;

    // Constructor Injection (MANDATORY as per PDF)
    public FraudRuleController(FraudRuleService fraudRuleService) {
        this.fraudRuleService = fraudRuleService;
    }

    // -------------------------------------------------
    // POST: Add a new fraud rule
    // URL: /api/rules
    // -------------------------------------------------
    @PostMapping
    public FraudRule addRule(@RequestBody FraudRule rule) {
        return fraudRuleService.addRule(rule);
    }

    // -------------------------------------------------
    // GET: Fetch all fraud rules
    // URL: /api/rules
    // -------------------------------------------------
    @GetMapping
    public List<FraudRule> getAllRules() {
        return fraudRuleService.getAllRules();
    }
}
