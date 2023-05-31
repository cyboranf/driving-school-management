package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
