package com.codeclan.lab.CourseBooking;

import com.codeclan.lab.CourseBooking.models.Booking;
import com.codeclan.lab.CourseBooking.models.Course;
import com.codeclan.lab.CourseBooking.models.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingApplicationTests {

	Course course;
	Booking booking;
	Customer customer;

	@Before
	public void setup() {
		course = new Course("Python 1.0", "Aberdeen",4);
		booking = new Booking("01-12-2019");
		customer = new Customer("Bob", "Sydney", 22);
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

}
