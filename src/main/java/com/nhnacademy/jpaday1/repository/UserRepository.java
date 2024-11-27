package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    // 유저 아이디와 비밀번호가 일치하는 유저 반환
    @Query("select u from User u where u.userId = :userId and u.userPassword = :password")
    User match(String userId, String password);

    // updateLatestLoginAtByUserId 구현 필요

}
