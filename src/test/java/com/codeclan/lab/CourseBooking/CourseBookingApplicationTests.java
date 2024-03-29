package com.codeclan.lab.CourseBooking;

import com.codeclan.lab.CourseBooking.models.Booking;
import com.codeclan.lab.CourseBooking.models.Course;
import com.codeclan.lab.CourseBooking.models.Customer;
import com.codeclan.lab.CourseBooking.repositories.BookingRepository;
import com.codeclan.lab.CourseBooking.repositories.CourseRepository;
import com.codeclan.lab.CourseBooking.repositories.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	Course course;
	Booking booking;
	Course course1;
	Booking booking1;
	Customer customer;
	Customer customer1;

	@Before
	public void setup() {
		course = new Course("Python 1.0", "Aberdeen",4);
		customer = new Customer("Bob", "Sydney", 22);
		booking = new Booking("01-12-2019", course, customer);
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCourseName ()  {
		assertEquals("Python 1.0", course.getCourseName());
	}

	@Test
	public void canSetCourseName() {
		course.setCourseName("Py-x 2");
		assertEquals("Py-x 2", course.getCourseName());
	}

	@Test
	public void canGetCourseTown() {
		assertEquals("Aberdeen", course.getCourseTown());
	}

	@Test
	public void canSetCourseTown() {
		course.setCourseTown("Perth");
		assertEquals("Perth", course.getCourseTown());
	}

	@Test
	public void canGetRating() {
		assertEquals(4, course.getRating());
	}

	@Test
	public void canSetRating() {
		course.setRating(2);
		assertEquals(2, course.getRating());
	}

	@Test
	public void canGetDate() {
		assertEquals("01-12-2019", booking.getDate());
	}

	@Test
	public void canSetDate() {
		booking.setDate("01-22-2018");
		assertEquals("01-22-2018", booking.getDate());
	}

	@Test
	public void canGetCustName ()  {
		assertEquals("Bob", customer.getCustName());
	}

	@Test
	public void canSetCustName() {
		customer.setCustName("Jane");
		assertEquals("Jane", customer.getCustName());
	}

	@Test
	public void canGetCustTown ()  {
		assertEquals("Sydney", customer.getCustTown());
	}

	@Test
	public void canSetCustTown() {
		customer.setCustTown("Stonehaven");
		assertEquals("Stonehaven", customer.getCustTown());
	}

	@Test
	public void canGetAge ()  {
		assertEquals(22, customer.getAge());
	}

	@Test
	public void canSetAge() {
		customer.setAge(19);
		assertEquals(19, customer.getAge());
	}
	@Test
	public void createCustomer() {
		customer = new Customer("Jim", "Sydney", 22);
		customerRepository.save(customer);
	}

	@Test
	public void createBookingOnACourseWithACustomer() {
		course1 = new Course("Python 1.0", "Aberdeen",4);
		courseRepository.save(course1);
		customer1 = new Customer("Bob", "Sydney", 22);
		customerRepository.save(customer1);
//		booking1 = new Booking("01-12-2019", course1);
//		bookingRepository.save(booking1);

	}
}
