package com.example.springfirstlesson.controllers;

import com.example.springfirstlesson.models.Position;
import com.example.springfirstlesson.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    Position position = new Position(1l, "Java Developer", 250000);

    @GetMapping("/user")
    public User getUser() {
        User user = new User(1l, "John", "Doe", true, 50000.00, position);
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1l, "John", "Doe", true, 50000.00, position));
        users.add(new User(2l, "John", "Doe", true, 50000.00, position));
        users.add(new User(3l, "John", "Doe", true, 50000.00, position));
        users.add(new User(4l, "John", "Doe", true, 50000.00, position));
        users.add(new User(5l, "John", "Doe", true, 50000.00, position));
        return users;
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        User user = new User(id, "John", "Doe", true, 50000.00, position);
        return user;
    }


}
