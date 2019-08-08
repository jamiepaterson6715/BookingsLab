package com.codeclan.lab.CourseBooking.models;

public class Course {
    private String courseName;
    private String courseTown;
    private int rating;
//    private List<Bookinh>;


    public Course(String courseName, String courseTown, int rating) {
        this.courseName = courseName;
        this.courseTown = courseTown;
        this.rating = rating;
    }


    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
