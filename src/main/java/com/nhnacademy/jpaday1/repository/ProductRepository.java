package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAllByProductNameLike(String query, Pageable pageable);
    int countAllByProductNameLike(String query);

}
