package com.nhnacademy.jpaday1.repository.querydsl;

import com.nhnacademy.jpaday1.entity.*;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public class ProductCategoryQuerydslRepositoryImpl extends QuerydslRepositorySupport implements ProductCategoryQuerydslRepository {

    public ProductCategoryQuerydslRepositoryImpl() {
        super(ProductCategory.class);
    }

    @Override
    public List<Category> findAllByProductId(int productId) {
        QProductCategory productCategory = QProductCategory.productCategory;
        QProduct product = QProduct.product;
        QCategory category = QCategory.category;

        return from(productCategory)
                .innerJoin(productCategory.category, category)
                .innerJoin(productCategory.product, product)
                .where(product.productId.eq(productId))
                .select(category)
                .fetch();
    }

}
