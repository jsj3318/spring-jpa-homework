package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.Purchase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
    Page<Purchase> findByUser_UserId(String userId, Pageable pageable);
    int countByUser_UserId(String userId);
}
