package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.claim;

public interface ClaimRepository extends JpaRepository<claim, Long>(){
    
}
