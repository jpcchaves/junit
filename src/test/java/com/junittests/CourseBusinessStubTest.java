package com.junittests;

import static org.junit.jupiter.api.Assertions.*;

import com.junittests.business.CourseBusiness;
import com.junittests.service.CourseService;
import com.junittests.stubs.CourseServiceStub;
import java.util.List;
import org.junit.jupiter.api.Test;

class CourseBusinessStubTest {

  @Test
  void testCoursesRelatedToSpring_When_UsingStub() {

    // Given
    CourseService stubService = new CourseServiceStub();

    CourseBusiness business = new CourseBusiness(stubService);

    // When
    List<String> filteredCourses =
        business.retrieveCoursesRelatedToSpring("Joao");

    // Then
    assertEquals(4, filteredCourses.size());
  }
}
