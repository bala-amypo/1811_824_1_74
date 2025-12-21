package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class FraudRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double thresholdAmount;

    public Long getId() {
        return id;
    }

    public double getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(double thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }
}
