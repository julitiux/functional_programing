package com.functionalPrograming.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

  @Override
  public Map<Integer, List<String>> nameOfPeopleByAge(List<Person> personList) {
    return personList.stream()
      .collect(Collectors.groupingBy(Person::getAge, mapping(Person::getName, toList())));
  }

  @Override
  public Map<Character, Optional<Person>> odestPersonOfEachLetter(List<Person> personList) {
    return personList.stream()
      .collect(groupingBy(person -> person.getName().charAt(0), reducing(BinaryOperator.maxBy(byAge))));
  }

}
