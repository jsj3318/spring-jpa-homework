package com.nhnacademy.jpaday1.entity;

import jakarta.persistence.*;
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

    @ManyToOne(cascade = CascadeType.ALL)
    private Users user;

    @NotNull
    private int changeAmount;

    @NotBlank
    @Length(max = 50)
    private String reason;

    @NotNull
    private ZonedDateTime dateTime;

}
