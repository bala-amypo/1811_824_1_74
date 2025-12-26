package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;

@RestController
@RequestMapping("/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @PostMapping
    public Policy createPolicy(@RequestBody Policy policy) {
        return policyService.createPolicy(policy);
    }

    @GetMapping("/user/{userId}")
    public List<Policy> getPoliciesByUser(@PathVariable Long userId) {
        return policyService.getPoliciesByUser(userId);
    }
}
