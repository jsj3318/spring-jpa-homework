package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.PurchaseProduct;
import com.nhnacademy.jpaday1.entity.pk.PurchaseProductPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseProductRepository extends JpaRepository<PurchaseProduct, PurchaseProductPK> {
    int countAllByPurchase_PurchaseId(int purchaseId);
    List<PurchaseProduct> findAllByPurchase_PurchaseId(int purchaseId);
}
