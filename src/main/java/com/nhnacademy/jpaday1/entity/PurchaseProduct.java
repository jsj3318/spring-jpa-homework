package com.nhnacademy.jpaday1.entity;

import com.nhnacademy.jpaday1.entity.pk.PurchaseProductPK;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class PurchaseProduct {

    @EmbeddedId
    private PurchaseProductPK pk;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("purchaseId")
    private Purchase purchase;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("productId")
    private Product product;

    @NotNull
    private int quantity;

    public PurchaseProduct(Purchase purchase, Product product, int quantity) {
        this.purchase = purchase;
        this.product = product;
        this.quantity = quantity;
        this.pk = new PurchaseProductPK(purchase.getPurchaseId(), product.getProductId());
    }
}
