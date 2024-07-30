package com.junittests;

import static org.junit.jupiter.api.Assertions.*;

import com.junittests.model.Person;
import com.junittests.service.IPersonService;
import com.junittests.service.impl.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {

  private Person person;
  private IPersonService service;

  @BeforeEach
  void setup() {
    person =
        new Person("Joao", "Paulo", "Recife - PE", "email@outlook.com", "MALE");

    service = new PersonService();
  }

  @DisplayName(
      "When create a Person with success should return a Person object")
  @Test
  void testCreatePerson_WhenSuccess_ShouldReturnPerson() {

    // Given

    // When
    Person actualPerson = service.createPerson(person);

    // Then
    assertNotNull(
        actualPerson, () -> "The createPerson should not have returned null");
  }

  @DisplayName(
      "When create a Person with success should return Person not null and all"
          + " the fields in Person")
  @Test
  void
      testCreatePerson_WhenSuccess_ShouldContainsPersonObjectWithAllTheFields() {

    // Given

    // When
    Person actualPerson = service.createPerson(person);

    // Then
    assertNotNull(actualPerson);

    assertNotNull(actualPerson.getId());

    assertEquals(
        person.getFirstName(),
        actualPerson.getFirstName(),
        () -> "The firstName is not equal");

    assertEquals(
        person.getLastName(),
        actualPerson.getLastName(),
        () -> "The firstName is not equal");

    assertEquals(
        person.getEmail(),
        actualPerson.getEmail(),
        () -> "The firstName is not equal");

    assertEquals(
        person.getAddress(),
        actualPerson.getAddress(),
        () -> "The firstName is not equal");

    assertEquals(
        person.getGender(),
        actualPerson.getGender(),
        () -> "The firstName is not equal");
  }

  @DisplayName("When create a Person with null e-mail should throw Exception")
  @Test
  void testCreatePerson_WithNullEmail_ShoulThrowIllegalArgumentException() {

    // Given
    person.setEmail(null);

    // Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            // When
            service.createPerson(person),
        () ->
            "When create person with null email should return"
                + " IllegalArgumentException!");
  }
}
