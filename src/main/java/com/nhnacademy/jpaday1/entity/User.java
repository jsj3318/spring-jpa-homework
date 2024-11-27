package com.nhnacademy.jpaday1.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.ZonedDateTime;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Length(max = 50)
    private String userId;

    @NotBlank
    @Length(max = 50)
    private String userName;

    @NotBlank
    @Length(max = 200)
    private String userPassword;

    @NotBlank
    @Length(max = 8)
    private String userBirth;

    @NotBlank
    @Length(max = 10)
    private String userAuth;

    @NotNull
    private int userPoint;

    @NotNull
    private ZonedDateTime createdAt;

    @Null
    private ZonedDateTime latestLoginAt;

}
