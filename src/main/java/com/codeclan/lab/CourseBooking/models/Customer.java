package com.codeclan.lab.CourseBooking.models;

import java.io.StringReader;
import java.util.List;

public class Customer {
    private String custName;
    private String custTown;
    private int age;
//    private List<Booking>;

    public Customer(String custName, String custTown, int age) {
        this.custName = custName;
        this.custTown = custTown;
        this.age = age;
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
}
