package com.mon.springdatajpapractice.service;

import com.mon.springdatajpapractice.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public Long getTotalCoursesByInstructor(int id){
        return repository.getTotalCoursesByInstructorId(id);
    }
}
