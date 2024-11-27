package com.nhnacademy.jpaday1.createRequest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record CreateUserRequest(
        @Length(max = 50) String userId,
        @NotBlank @Length(max = 50) String userName,
        @NotBlank @Length(max = 200) String userPassword,
        @NotBlank @Length(max = 8) String userBirth,
        @NotBlank @Length(max = 10) String userAuth,
        @NotNull int userPoint
) {
}
