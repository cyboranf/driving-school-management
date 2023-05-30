package com.example.drivingschoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer testId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "instructor_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Instructor instructor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Course course;

    private Integer score;

    private Boolean result;

    private LocalDate testDate;
}
