package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.ProductCategory;
import com.nhnacademy.jpaday1.entity.pk.ProductCategoryPK;
import com.nhnacademy.jpaday1.repository.querydsl.ProductCategoryQuerydslRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, ProductCategoryPK>, ProductCategoryQuerydslRepository {
    // 카테고리 아이디로 페이징 검색
    Page<ProductCategory> findAllByCategoryCategoryId(int categoryCategoryId, Pageable pageable);

    // 상품 아이디로 카테고리 검색 -> Querydsl

    // 카테고리 아이디로 갯수 검색
    int countByCategoryCategoryId(int categoryCategoryId);

    // 상품아이디로 제거 -> @Query
    @Modifying(clearAutomatically = true)
    @Query("delete from ProductCategory where product.productId = :productId")
    void deleteByProductIdAndClear(int productId);
}
