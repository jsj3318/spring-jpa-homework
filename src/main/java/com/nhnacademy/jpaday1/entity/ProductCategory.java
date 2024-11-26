package com.nhnacademy.jpaday1.entity;

import com.nhnacademy.jpaday1.entity.pk.ProductCategoryPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class ProductCategory {

    @EmbeddedId
    private ProductCategoryPK pk;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("categoryId")
    private Category category;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("productId")
    private Product product;

    public ProductCategory(Category category, Product product) {
        this.category = category;
        this.product = product;
        this.pk = new ProductCategoryPK(product.getProductId(), category.getCategoryId());
    }
}
