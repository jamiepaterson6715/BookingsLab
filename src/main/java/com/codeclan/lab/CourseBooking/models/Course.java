package com.codeclan.lab.CourseBooking.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_town")
    private String courseTown;

    @Column(name = "rating")
    private int rating;

    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Booking> bookings;


    public Course(String courseName, String courseTown, int rating) {
        this.courseName = courseName;
        this.courseTown = courseTown;
        this.rating = rating;
        this.bookings = new ArrayList<Booking>();
    }

    public Course() {}

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTown() {
        return this.courseTown;
    }

    public void setCourseTown(String courseTown) {
        this.courseTown = courseTown;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}


