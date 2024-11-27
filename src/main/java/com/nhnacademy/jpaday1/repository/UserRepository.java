package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.ZonedDateTime;

public interface UserRepository extends JpaRepository<User, String> {
    // 유저 아이디와 비밀번호가 일치하는 유저 반환
    @Query("select u from User u where u.userId = :userId and u.userPassword = :password")
    User match(String userId, String password);

    // 유저 아이디로 유저의 마지막 로그인 시각 수정
    @Modifying(clearAutomatically = true)
    @Query("update User u set u.latestLoginAt = :latestLoginAt where u.userId = :userId")
    User updateLatestLogin(String userId, ZonedDateTime latestLoginAt);

}
