package com.codeclan.lab.CourseBooking.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name= "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "date")
    private String date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    public Booking(String date, Course course) {
        this.date = date;
        this.course = course;
    }

    public Booking() {}

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
