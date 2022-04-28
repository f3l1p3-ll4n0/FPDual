package com.bl.fpdual.practica3.controllers;


import org.springframework.web.bind.annotation.*;

import com.bl.fpdual.practica3.model.User;
import com.bl.fpdual.practica3.model.UserRepository;
import com.bl.fpdual.practica3.services.UserService;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
    }

    // Add
    @PostMapping(value = "/users")
    public User Post(@RequestBody User params) {
        return userService.Post(params);
    }

    // Get
    @GetMapping(value = "/users")
    public List<User> Get() {
        return userService.Get();
    }

    // Get By ID
    @GetMapping(value = "/users/{id}")
    public User Get(@PathVariable int id) {
        return userService.Get(id);
    }

    // Update
    @PutMapping(value = "/users/{id}")
    public User Update(@PathVariable int id, @RequestBody User params) {
        return userService.Update(params, id);
    }

    // Delete
    @DeleteMapping(value = "/users/{id}")
    public String Delete(@PathVariable int id) {
        return userService.Delete(id);
    }
}