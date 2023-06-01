package com.example.drivingschoolmanagement.controller;

import com.example.drivingschoolmanagement.model.Student;
import com.example.drivingschoolmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/today_lessons")
    public List<Student> getStudentsWithLessonsToday() {
        return studentService.getStudentsWithLessonsToday();
    }

    @GetMapping("/started/{year}")
    public List<Student> getStudentsStartedInYear(@PathVariable Integer year) {
        return studentService.getStudentsStartedInYear(year);
    }

}
