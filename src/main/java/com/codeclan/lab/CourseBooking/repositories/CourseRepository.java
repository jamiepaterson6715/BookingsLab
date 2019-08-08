package com.codeclan.lab.CourseBooking.repositories;

import com.codeclan.lab.CourseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
