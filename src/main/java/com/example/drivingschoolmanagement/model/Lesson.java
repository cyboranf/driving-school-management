package com.example.drivingschoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer lessonId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "assignment_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private VehicleAssignment vehicleAssignment;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Student student;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Course course;

    @ManyToOne(optional = false)
    @JoinColumn(name = "instructor_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Instructor instructor;

    private LocalDate lessonDate;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
