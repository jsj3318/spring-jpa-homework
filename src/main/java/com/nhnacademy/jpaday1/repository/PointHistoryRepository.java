package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.PointHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointHistoryRepository extends JpaRepository<PointHistory, Integer> {
    Page<PointHistory> findAllByUser_UserId(String userId, Pageable pageable);
    int countAllByUser_UserId(String userId);
}
