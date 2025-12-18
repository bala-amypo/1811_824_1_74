// package com.example.demo.model;

// import jakarta.persistence.*;

// @Entity
// @Table(uniqueConstraints = @UniqueConstraint(columnNames = "ruleName"))
// public class FraudRule {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String ruleName;
//     private String conditionField; 
//     private String operator;      
//     private String value;
//     private String severity;       

    

//     public FraudRule() {
//     }

//     public FraudRule(String conditionField, Long id, String operator, String ruleName, String severity, String value) {
//         this.conditionField = conditionField;
//         this.id = id;
//         this.operator = operator;
//         this.ruleName = ruleName;
//         this.severity = severity;
//         this.value = value;
//     }
    

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getRuleName() {
//         return ruleName;
//     }

//     public void setRuleName(String ruleName) {
//         this.ruleName = ruleName;
//     }

//     public String getConditionField() {
//         return conditionField;
//     }

//     public void setConditionField(String conditionField) {
//         this.conditionField = conditionField;
//     }

//     public String getOperator() {
//         return operator;
//     }

//     public void setOperator(String operator) {
//         this.operator = operator;
//     }

//     public String getValue() {
//         return value;
//     }

//     public void setValue(String value) {
//         this.value = value;
//     }

//     public String getSeverity() {
//         return severity;
//     }

//     public void setSeverity(String severity) {
//         this.severity = severity;
//     }


// }
