package com.nhnacademy.jpaday1.repository.querydsl;

import com.nhnacademy.jpaday1.entity.Category;

import java.util.List;

public interface ProductCategoryQuerydslRepository {
    // 상품 아이디로 검색
    List<Category> findAllByProductId(int productId);
}
