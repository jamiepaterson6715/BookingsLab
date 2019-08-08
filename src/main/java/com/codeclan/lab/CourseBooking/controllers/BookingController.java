package com.codeclan.lab.CourseBooking.controllers;

import com.codeclan.lab.CourseBooking.models.Booking;
import com.codeclan.lab.CourseBooking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/bookings")

public class BookingController {
    @Autowired
    BookingRepository bookingRepository;
    @GetMapping
    public List<Booking> getAllBoookings() {
        return bookingRepository.findAll();
    }
}
