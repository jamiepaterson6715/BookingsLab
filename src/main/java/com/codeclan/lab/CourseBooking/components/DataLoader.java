package com.codeclan.lab.CourseBooking.components;


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
    }

}