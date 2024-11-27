package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.Address;
import com.nhnacademy.jpaday1.repository.dto.AddressOnlyView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    // 유저 아이디로 주소 갯수 검색
    int countAllByUserUserId(String userId);

    // 유저 아이디로 주소 검색
    List<Address> findAllByUserUserId(String userId);
    // 유저 아이디로 주소 페이징 검색
    Page<Address> findAllByUserUserId(String userId, Pageable pageable);


    // dto 반환
    AddressOnlyView findAddressOnlyByAddressId(int id);
}
