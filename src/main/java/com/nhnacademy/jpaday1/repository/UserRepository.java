package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserIdAndUserPassword(String userId, String password);
    // @query로 updateLatestLoginAtByUserId 구현 필요
}
