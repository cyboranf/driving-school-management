package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}
