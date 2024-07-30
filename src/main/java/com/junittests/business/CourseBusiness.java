package com.junittests.business;

import com.junittests.service.CourseService;
import java.util.ArrayList;
import java.util.List;

// CourseBusiness => SUT - System Under Test
public class CourseBusiness {

  // Dependency
  private final CourseService service;

  public CourseBusiness(CourseService service) {
    this.service = service;
  }

  public List<String> retrieveCoursesRelatedToSpring(String student) {

    List<String> filteredCourses = new ArrayList<>();

    List<String> allCourses = service.retrieveCourses(student);

    for (String course : allCourses) {

      if (course.contains("Spring")) {

        filteredCourses.add(course);
      }
    }

    return filteredCourses;
  }

  public void deleteCoursesNotRelatedToSpring(String student) {

    List<String> allCourses = service.retrieveCourses(student);

    for (String course : allCourses) {

      if (!course.contains("Spring")) {

        service.deleteCourse(course);
      }
    }
  }
}
