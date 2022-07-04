package com.mon.springdatajpapractice.controller;

import com.mon.springdatajpapractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/total-instructor-courses")
    public Long getTotalInstructorCourses(){
        return courseService.getTotalCoursesByInstructor(2);
    }

    @GetMapping("/say-hello")
    public String sayHello(){
        return "Saying hello from spring boot";
    }
}
