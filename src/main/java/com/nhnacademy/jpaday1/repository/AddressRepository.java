package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    int countAllByUser_UserId(String userId);

    List<Address> findAllByUser_UserId(String userId);
    Page<Address> findAllByUser_UserId(String userId, Pageable pageable);

}
