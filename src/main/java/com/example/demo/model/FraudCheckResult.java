// package com.example.demo.model;

// import jakarta.persistence.*;

// @Entity
// public class FraudCheckResult {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     private Claim claim;

//     @ManyToOne
//     private FraudRule fraudRule;

//     private boolean flagged;


//     public FraudCheckResult() {
//     }

//     public FraudCheckResult(Claim claim, boolean flagged, FraudRule fraudRule, Long id) {
//         this.claim = claim;
//         this.flagged = flagged;
//         this.fraudRule = fraudRule;
//         this.id = id;
//     }
   
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public Claim getClaim() {
//         return claim;
//     }

//     public void setClaim(Claim claim) {
//         this.claim = claim;
//     }

//     public FraudRule getFraudRule() {
//         return fraudRule;
//     }

//     public void setFraudRule(FraudRule fraudRule) {
//         this.fraudRule = fraudRule;
//     }

//     public boolean isFlagged() {
//         return flagged;
//     }

//     public void setFlagged(boolean flagged) {
//         this.flagged = flagged;
//     }

    
// }
