package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // 상품 이름에 query 들어간 상품 페이징 검색
    Page<Product> findAllByProductNameLike(String query, Pageable pageable);
    // 상품 이름에 query 들어간 상품 갯수 검색
    int countAllByProductNameLike(String query);

    // 카테고리 검색 -> 상품_카테고리 레포지 에서
    
}
