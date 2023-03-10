package com.example.demo.service;

import com.example.demo.model.dto.CreateUserResponse;
import com.example.demo.model.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public CreateUserResponse createUser(String username, String email) {
        User userEntity = new User(username, email);
        userRepository.save(userEntity);
        return new CreateUserResponse(userEntity.getId(), userEntity.getUsername(), userEntity.getEmail());
    }
}
