package com.nhnacademy.jpaday1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.ZonedDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PointHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historyId;

    @NotBlank
    @Length(max = 50)
    private String userId;

    @NotNull
    private int changeAmount;

    @NotBlank
    @Length(max = 50)
    private String reason;

    @NotNull
    private ZonedDateTime dateTime;

}
