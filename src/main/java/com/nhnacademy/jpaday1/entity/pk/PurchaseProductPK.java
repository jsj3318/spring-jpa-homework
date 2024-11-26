package com.nhnacademy.jpaday1.entity.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PurchaseProductPK implements Serializable {

    private int purchaseId;
    private int productId;

}
