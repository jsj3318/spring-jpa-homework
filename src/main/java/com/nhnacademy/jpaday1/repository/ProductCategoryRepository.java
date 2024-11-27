package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.ProductCategory;
import com.nhnacademy.jpaday1.entity.pk.ProductCategoryPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, ProductCategoryPK> {
    Page<ProductCategory> findAllByCategory_CategoryId(int categoryCategoryId, Pageable pageable);
    List<ProductCategory> findAllByProduct_ProductId(int productId);

    int countByCategory_CategoryId(int categoryCategoryId);

    void deleteByProduct_ProductId(int productId);


}
