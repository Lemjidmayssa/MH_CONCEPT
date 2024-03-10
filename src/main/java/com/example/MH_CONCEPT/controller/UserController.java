package com.example.MH_CONCEPT.controller;

import com.example.MH_CONCEPT.entity.User;
import com.example.MH_CONCEPT.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUsers(String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(id));
    }

    //@PostMapping('')



}
