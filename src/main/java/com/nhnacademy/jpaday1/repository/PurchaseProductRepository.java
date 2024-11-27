package com.nhnacademy.jpaday1.repository;

import com.nhnacademy.jpaday1.entity.PurchaseProduct;
import com.nhnacademy.jpaday1.entity.pk.PurchaseProductPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseProductRepository extends JpaRepository<PurchaseProduct, PurchaseProductPK> {
    // 주문 아이디로 갯수 검색
    int countAllByPurchasePurchaseId(int purchaseId);
    // 주문 아이디로 전체 검색
    List<PurchaseProduct> findAllByPurchasePurchaseId(int purchaseId);
}
