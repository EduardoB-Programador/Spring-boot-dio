package com.web.api.controller;

import com.web.api.model.User;
import com.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getUsers() {
        return repository.getAllUsers();
    }

    @GetMapping("/{name}")
    public User getUserByName(@PathVariable("name") String name) {
        return repository.findByName(name);
    }

    @GetMapping("/id/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return repository.findByID(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }

    @DeleteMapping("/del/id/{id}")
    public void deleteUserById(@PathVariable("id") int id) {
        repository.deleteByID(id);
    }

    @DeleteMapping("/del/{name}")
    public void deleteUserByName(@PathVariable("name") String name) {
        repository.deleteByName(name);
    }

}
