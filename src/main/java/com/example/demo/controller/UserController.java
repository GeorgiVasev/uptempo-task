package com.example.demo.controller;

import com.example.demo.model.dto.CreateUserRequest;
import com.example.demo.model.dto.CreateUserResponse;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController("/api")
public class UserController {

    final UserService userService;

    @PostMapping("/user")
    CreateUserResponse registerUser(@RequestBody CreateUserRequest userRequest) {
        return userService.createUser(userRequest.getUsername(), userRequest.getEmail());
    }

    @GetMapping("/list")
    void getAllUsers() {
        //TO DO
    }

    @PutMapping("update")
    void updateUser() {
        //TO DO
    }

    @DeleteMapping("/user{username}")
    void deleteUser() {
        //TO DO
    }
}
