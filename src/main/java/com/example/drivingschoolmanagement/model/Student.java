package com.example.drivingschoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String phoneNumber;

    private String email;

    private String address;

    private LocalDate startDate;

    @OneToMany(mappedBy = "student")
    private List<Lesson> lessons;

    @OneToMany(mappedBy = "student")
    private List<Test> tests;
}