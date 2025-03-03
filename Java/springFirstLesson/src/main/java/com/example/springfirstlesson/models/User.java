package com.example.springfirstlesson.models;

public record User(Long id, String firstName, String lastName, boolean active, double salary, Position position) {
}
