package com.codeclan.lab.CourseBooking.models;

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

    public Booking(String date) {
        this.date = date;
    }

    public Booking() {}

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
