package com.example.service;

import java.util.List;
import com.example.demo..Policy;

public interface PolicyService {
    Policy createPolicy(Policy policy);
    List<Policy> getPoliciesByUser(Long userId);
}
