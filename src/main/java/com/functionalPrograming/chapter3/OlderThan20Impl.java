package com.functionalPrograming.chapter3;

import java.util.ArrayList;
import java.util.List;

public class OlderThan20Impl implements OlderThan20 {

  @Override
  public List<Person> olderThan20(List<Person> personList) {
    List<Person> olderThan20 = new ArrayList<>();
    personList.stream()
      .filter(person -> person.getAge() > 20)
      .forEach(person -> olderThan20.add(person));
    return olderThan20;
  }

}
