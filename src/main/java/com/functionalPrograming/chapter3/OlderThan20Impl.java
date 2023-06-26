package com.functionalPrograming.chapter3;

import java.util.List;
import java.util.stream.Collectors;

public class OlderThan20Impl implements OlderThan20 {

  @Override
  public List<Person> olderThan20(List<Person> personList) {
    return personList.stream()
      .filter(person -> person.getAge() > 20)
      .collect(Collectors.toList());
  }

}
