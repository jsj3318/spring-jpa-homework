package com.nhnacademy.jpaday1.createRequest;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateAddressRequest {
    private List<AddressRequest> addresses;

    @Getter
    @Setter
    public static class AddressRequest {
        private String userId;
        private String address;
    }



}
