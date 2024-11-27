package com.nhnacademy.jpaday1.controller;

import com.nhnacademy.jpaday1.createRequest.CreateAddressRequest;
import com.nhnacademy.jpaday1.entity.Address;
import com.nhnacademy.jpaday1.entity.User;
import com.nhnacademy.jpaday1.repository.AddressRepository;
import com.nhnacademy.jpaday1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    UserRepository userRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Address> saveAll(@RequestBody CreateAddressRequest request) {
        List<Address> addresses = new ArrayList<>();

        // 요청으로 받은 address 데이터를 처리
        for (CreateAddressRequest.AddressRequest addressRequest : request.getAddresses()) {
            User user = userRepository.findById(addressRequest.getUserId())
                    .orElseThrow(() -> new RuntimeException("User not found"));

            Address address = new Address();
            address.setUser(user);
            address.setAddress(addressRequest.getAddress());
            addresses.add(address);
        }

        // 여러 개의 Address를 저장
        return addressRepository.saveAll(addresses);
    }

    // Pageable로 페이징 처리
    @GetMapping
    public Page<Address> getAddresses(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    // dto로 주소만을 보여주기
    @GetMapping("/{id}")
    public String getOnlyAddress(@PathVariable int id) {
        return addressRepository.findAddressOnlyByAddressId(id).getAddress();
    }

}
