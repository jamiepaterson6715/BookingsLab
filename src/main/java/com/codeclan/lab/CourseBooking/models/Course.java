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


