package com.codeclan.lab.CourseBooking.controllers;

import com.codeclan.lab.CourseBooking.models.Course;
import com.codeclan.lab.CourseBooking.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping( value = "/courses")

public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}