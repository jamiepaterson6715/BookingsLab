package com.codeclan.lab.CourseBooking.repositories;

import com.codeclan.lab.CourseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
