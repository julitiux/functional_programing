package com.functionalPrograming.chapter3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OlderThan20Impl implements OlderThan20 {

  @Override
  public List<Person> olderThan20(List<Person> personList) {
    return personList.stream()
      .filter(person -> person.getAge() > 20)
      .collect(Collectors.toList());
  }

  @Override
  public Map<Integer, List<Person>> peopleByAge(List<Person> personList) {
    return personList.stream()
      .collect(Collectors.groupingBy(Person::getAge));
  }

}
