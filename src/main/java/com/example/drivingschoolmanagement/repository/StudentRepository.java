package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value = "CALL get_students_with_lessons_today;", nativeQuery = true)
    List<Student> findStudentsWithLessonsToday();
}
