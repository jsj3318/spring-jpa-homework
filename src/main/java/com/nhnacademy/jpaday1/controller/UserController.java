package com.nhnacademy.jpaday1.controller;

import com.nhnacademy.jpaday1.createRequest.CreateUserRequest;
import com.nhnacademy.jpaday1.entity.User;
import com.nhnacademy.jpaday1.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // DomainClassConverter 이용
    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Optional<User> user) {
        return user.orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@Valid @RequestBody CreateUserRequest request) {
        User user = new User(
                request.userId(),
                request.userName(),
                request.userPassword(),
                request.userBirth(),
                request.userAuth(),
                request.userPoint(),
                ZonedDateTime.now(),
                null
        );
        return userRepository.save(user);
    }

}
