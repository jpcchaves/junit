package com.junittests.service.impl;

import com.junittests.model.Person;
import com.junittests.service.IPersonService;
import java.util.Date;
import java.util.Objects;

public class PersonService implements IPersonService {
  @Override
  public Person createPerson(Person person) {
    person.setId(new Date().getTime());

    if (Objects.isNull(person.getEmail()) || person.getEmail().isBlank()) {

      throw new IllegalArgumentException("Email cannot be null or empty");
    }

    return person;
  }
}
