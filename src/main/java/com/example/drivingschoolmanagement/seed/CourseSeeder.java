package com.example.drivingschoolmanagement.seed;

import com.example.drivingschoolmanagement.model.Course;
import com.example.drivingschoolmanagement.repository.CourseRepository;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CourseSeeder {
    @Autowired
    private CourseRepository courseRepository;

    @PostConstruct
    public void init() {
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCourseName(faker.educator().course());
            course.setCourseDescription(faker.lorem().sentence());
            course.setCourseDuration(faker.number().numberBetween(1, 12));
            course.setCourseFee(new BigDecimal(faker.number().randomDouble(2, 500, 2000)));
            courseRepository.save(course);
        }
    }
}
