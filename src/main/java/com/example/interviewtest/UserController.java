package com.example.interviewtest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<String> createUser() {
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }
}
