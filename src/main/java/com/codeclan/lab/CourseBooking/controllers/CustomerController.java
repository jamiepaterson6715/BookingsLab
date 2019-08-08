package com.codeclan.lab.CourseBooking.controllers;

import com.codeclan.lab.CourseBooking.models.Customer;
import com.codeclan.lab.CourseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/customers")

public class CustomerController {
@Autowired
    CustomerRepository customerRepository;
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
