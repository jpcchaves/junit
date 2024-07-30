package com.junittests;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import com.junittests.business.CourseBusiness;
import com.junittests.service.CourseService;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CourseBusinessMockTest {

  CourseService mockService;
  CourseBusiness business;
  List<String> courses;

  @BeforeEach
  void setup() {

    // Given
    mockService = mock(CourseService.class);
    business = new CourseBusiness(mockService);

    courses =
        Arrays.asList(
            "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
            "Agile Desmistificado com Scrum, XP, Kanban e Trello",
            "Spotify Engineering Culture Desmistificado",
            "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
            "Docker do Zero à Maestria - Contêinerização Desmistificada",
            "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
            "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
            "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
            "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
            "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
            "Microsserviços do 0 com Spring Cloud, Kotlin e Docker");
  }

  @Test
  void testCoursesRelatedToSpring_When_UsingMock() {

    // Given / Arrange
    when(mockService.retrieveCourses("Joao")).thenReturn(courses);

    // When
    List<String> filteredCourses =
        business.retrieveCoursesRelatedToSpring("Joao");

    // Then
    assertEquals(4, filteredCourses.size());
  }

  @DisplayName(
      "Delete courses not related to spring using mockito verify should call"
          + " method")
  @Test
  void
      testsDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_ShouldCallMethod_deleteCourses() {

    // Given
    given(mockService.retrieveCourses("Joao")).willReturn(courses);

    // When
    business.deleteCoursesNotRelatedToSpring("Joao");

    // Then
    verify(mockService)
        .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
  }
}
