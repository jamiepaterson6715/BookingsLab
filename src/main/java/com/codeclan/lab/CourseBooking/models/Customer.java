package com.codeclan.lab.CourseBooking.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_town")
    private String custTown;

    @Column(name = "age")
    private int age;


    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    public Customer(String custName, String custTown, int age) {
        this.custName = custName;
        this.custTown = custTown;
        this.age = age;
        this.bookings = new ArrayList<Booking>();
    }

    public Customer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustTown() {
        return this.custTown;
    }

    public void setCustTown(String custTown) {
        this.custTown = custTown;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;

    }
}
