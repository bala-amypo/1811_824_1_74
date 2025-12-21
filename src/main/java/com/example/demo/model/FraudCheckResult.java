package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class FraudCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean fraud;

    @ManyToOne
    private Claim claim;

    public FraudCheckResult() {
    }

    public FraudCheckResult(Claim claim, boolean fraud, Long id) {
        this.claim = claim;
        this.fraud = fraud;
        this.id = id;
    }

    

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public Claim getClaim() {
        return claim;
    }

    public void setClaim(Claim claim) {
        this.claim = claim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

}

