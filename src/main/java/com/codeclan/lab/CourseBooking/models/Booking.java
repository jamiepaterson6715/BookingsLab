package com.codeclan.lab.CourseBooking.models;

public class Booking {
    private String date;

    public Booking(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
