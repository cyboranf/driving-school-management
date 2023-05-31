package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Procedure(name = "get_students_with_lessons_today")
    List<Student> findStudentsWithLessonsToday();


}
