package com.mon.springdatajpapractice.repo;

import com.mon.springdatajpapractice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Procedure("GET_TOTAL_COURSES_BY_INSTRUCTOR_ID")
    Long getTotalCoursesByInstructorId(int instructorId);
}
