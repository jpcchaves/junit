package com.junittests.service;

import java.util.List;

public interface CourseService {

  public List<String> retrieveCourses(String student);

  void deleteCourse(String course);
}
