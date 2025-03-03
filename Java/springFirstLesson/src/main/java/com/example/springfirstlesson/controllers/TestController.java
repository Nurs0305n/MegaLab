package com.example.springfirstlesson.controllers;


import com.example.springfirstlesson.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    @GetMapping("/app1")
    public String app1(@PathVariable(name = "name")  String firstname) {
        return firstname;
    }

}
