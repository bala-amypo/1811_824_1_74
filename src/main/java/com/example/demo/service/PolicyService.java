package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Policy;

public interface PolicyService {

    Policy savePolicy(Policy policy);

    List<Policy> getPoliciesByUser(Long userId);
}
