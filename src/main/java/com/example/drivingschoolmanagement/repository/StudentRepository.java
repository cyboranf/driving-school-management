package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
