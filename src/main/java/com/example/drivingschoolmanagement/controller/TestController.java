package com.example.drivingschoolmanagement.controller;

import com.example.drivingschoolmanagement.model.Test;
import com.example.drivingschoolmanagement.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/passed/{studentId}")
    public List<Test> getPassedTestsByStudent(@PathVariable Integer studentId) {
        return testService.getPassedTestsByStudent(studentId);
    }

    @GetMapping("/average/{courseId}")
    public Double getAverageTestScoreByCourse(@PathVariable Integer courseId) {
        return testService.getAverageTestScoreByCourse(courseId);
    }
}
