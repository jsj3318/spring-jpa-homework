package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.Purchase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
    // 유저 아이디로 페이징 검색
    Page<Purchase> findByUserUserId(String userId, Pageable pageable);
    // 유저 아이디로 갯수 검색
    int countByUserUserId(String userId);
}
