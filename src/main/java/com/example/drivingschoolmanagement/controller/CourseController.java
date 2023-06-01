package com.example.drivingschoolmanagement.controller;

import com.example.drivingschoolmanagement.model.Course;
import com.example.drivingschoolmanagement.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/today_lessons")
    public List<Course> getCoursesWithLessonsToday() {
        return courseService.getCoursesWithLessonsToday();
    }

}