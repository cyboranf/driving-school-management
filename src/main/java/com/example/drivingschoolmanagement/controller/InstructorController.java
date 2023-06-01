package com.example.drivingschoolmanagement.controller;

import com.example.drivingschoolmanagement.model.Instructor;
import com.example.drivingschoolmanagement.service.InstructorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    private final InstructorService instructorService;


    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/max_lessons_next_week")
    public List<Instructor> getInstructorsWithMaxLessonsNextWeek() {
        return instructorService.getInstructorsWithMaxLessonsNextWeek();
    }

    @GetMapping("/birthday/{month}")
    public List<Instructor> getInstructorsWithBirthdayInMonth(@PathVariable Integer month) {
        return instructorService.getInstructorsWithBirthdayInMonth(month);
    }

}

