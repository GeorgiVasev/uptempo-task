package com.example.demo.model.entity;


import com.example.demo.model.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "a_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    String username;
    @Column
    String email;

    // One-to-One relationship
    Address address;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
