package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
