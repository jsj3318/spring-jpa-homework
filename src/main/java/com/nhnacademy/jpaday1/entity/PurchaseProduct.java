package com.nhnacademy.jpaday1.entity;

import com.nhnacademy.jpaday1.entity.pk.PurchaseProductPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PurchaseProduct {

    @EmbeddedId
    private PurchaseProductPK pk;

    @NotNull
    private int quantity;

}
