package com.example.interviewtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<String> createUser() {
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

    @PutMapping("/users")
    public ResponseEntity<String> modifyUser() {
        log.info("validation");
        log.info("logic addressing");
        log.info("modification saving");

        return ResponseEntity.status(HttpStatus.OK).body("User modified successfully");
    }
}
