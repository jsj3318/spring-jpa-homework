package com.nhnacademy.jpaday1.entity.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class ProductCategoryPK implements Serializable {

    private int productId;

    private int categoryId;

}
