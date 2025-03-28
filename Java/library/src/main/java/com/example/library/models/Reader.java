package com.example.library.models;

import jakarta.persistence.*;

@Entity
@Table(name = "readers")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    String address;
    String birthDate;
}
