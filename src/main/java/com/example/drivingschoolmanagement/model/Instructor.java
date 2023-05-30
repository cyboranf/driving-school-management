package com.example.drivingschoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "instructors")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer instructorId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String phoneNumber;

    private String email;

    private String address;

    private LocalDate hireDate;

    @OneToMany(mappedBy = "instructor")
    private List<Lesson> lessons;

    @OneToMany(mappedBy = "instructor")
    private List<Test> tests;
}
