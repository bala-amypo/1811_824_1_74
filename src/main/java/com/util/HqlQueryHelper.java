package com.example.demo.util;

import com.example.demo.model.Claim;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HqlQueryHelper {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * HQL query to find claims with amount greater than given value
     */
    public List<Claim> findHighValueClaims(double minAmount) {
        return entityManager
                .createQuery(
                        "SELECT c FROM Claim c WHERE c.claimAmount > :amount",
                        Claim.class
                )
                .setParameter("amount", minAmount)
                .getResultList();
    }

    /**
     * Criteria-style query using LIKE on description
     */
    public List<Claim> findClaimsByDescriptionKeyword(String keyword) {

        if (keyword == null || keyword.isBlank()) {
            return List.of();
        }

        return entityManager
                .createQuery(
                        "SELECT c FROM Claim c WHERE LOWER(c.description) LIKE :keyword",
                        Claim.class
                )
                .setParameter("keyword", "%" + keyword.toLowerCase() + "%")
                .getResultList();
    }
}
