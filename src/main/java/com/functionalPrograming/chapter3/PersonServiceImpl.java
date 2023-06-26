package com.functionalPrograming.chapter3;

import java.util.List;
import java.util.stream.Collectors;

public class PersonServiceImpl implements PersonService {

  @Override
  public List<Person> ascendingAge(List<Person> personList) {
    return personList.stream()
      .sorted((person1, person2) -> person1.ageDifference(person2))
      .collect(Collectors.toList());
  }

}
