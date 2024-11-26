package com.nhnacademy.jpaday1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purchaseId;

    @Length(max = 50)
    private String userId;

    @NotNull
    private ZonedDateTime purchasedAt;

    @NotNull
    @Length(max = 100)
    private String destination;

    @NotNull
    private BigDecimal totalAmount;

}
