package com.example.demo.service;

import com.example.demo.model.dto.CreateUserResponse;

public interface UserService {

    CreateUserResponse createUser(String username, String email);
}
