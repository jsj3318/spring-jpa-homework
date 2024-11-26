package com.nhnacademy.jpaday1.entity;

import com.nhnacademy.jpaday1.entity.pk.ProductCategoryPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductCategory {

    @EmbeddedId
    private ProductCategoryPK pk;

}
