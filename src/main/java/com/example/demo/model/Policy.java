package com.example.model;

import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="policyNumber"))
public class Policy {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(nullable=false,unique=true)
    private String policyNumber;
    private String policyType;
    private LocalDate startDate;
    private LocalDate endDate;

    public Policy() {
    }

    public Policy(LocalDate endDate, Long id, String policyNumber, String policyType, LocalDate startDate, User user) {
        this.endDate = endDate;
        this.id = id;
        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.startDate = startDate;
        this.user = user;
    }
     

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    public String getPolicyType() {
        return policyType;
    }
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    
}
