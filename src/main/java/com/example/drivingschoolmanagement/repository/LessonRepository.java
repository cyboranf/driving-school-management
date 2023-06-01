package com.example.drivingschoolmanagement.repository;

import com.example.drivingschoolmanagement.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.time.LocalDate;
import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
    @Procedure(name = "lessons_today")
    List<Lesson> findLessonsToday();



}
