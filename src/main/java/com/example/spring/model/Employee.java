package com.example.spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // Lombok getters and setters
@Entity // makes this class a JPA entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name, nullable = false")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}