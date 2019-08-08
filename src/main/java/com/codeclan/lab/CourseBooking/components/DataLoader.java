package com.codeclan.lab.CourseBooking.components;


import com.codeclan.lab.CourseBooking.models.Booking;
import com.codeclan.lab.CourseBooking.models.Course;
import com.codeclan.lab.CourseBooking.models.Customer;
import com.codeclan.lab.CourseBooking.repositories.BookingRepository;
import com.codeclan.lab.CourseBooking.repositories.CourseRepository;
import com.codeclan.lab.CourseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Jim", "Sydney", 22);
        customerRepository.save(customer1);

        Course course1 = new Course("Python", "Edinburgh", 5);
        courseRepository.save(course1);

        Booking booking1 = new Booking("August 8 2019", course1);
        bookingRepository.save(booking1);
    }



}