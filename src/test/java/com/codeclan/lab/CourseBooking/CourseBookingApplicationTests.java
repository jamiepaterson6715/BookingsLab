package com.codeclan.lab.CourseBooking;

import com.codeclan.lab.CourseBooking.models.Course;
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

	@Before
	public void setup() {
		course = new Course("Python 1.0", "Aberdeen",4);
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
}
