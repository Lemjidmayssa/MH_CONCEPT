package com.example.MH_CONCEPT.controller;

import com.example.MH_CONCEPT.entity.User;
import com.example.MH_CONCEPT.response.Response;
import com.example.MH_CONCEPT.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Optional<User> getUsers(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Response> saveUser(@RequestBody User user) {
        userService.saveUser(user);
        Response res = Response.builder()
                .id(user.getId())
                .build();
        return ResponseEntity.status((HttpStatus.OK)).body(res);
    }


    @PutMapping("update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable String id, @RequestBody User user) throws Exception {
       userService.updateUser(id,user);
        return ResponseEntity.status((HttpStatus.OK)).body(user.getId());
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.status((HttpStatus.OK)).body(id);
    }



}
