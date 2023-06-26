package com.functionalPrograming.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonServiceImpl implements PersonService {

  @Override
  public List<Person> ascendingAge(List<Person> personList) {
    List<Person> ascendingAge = personList.stream()
      .sorted((person1, person2) -> person2.ageDifference(person1))
      .collect(Collectors.toList());

    printPeople("Sorted in descending order by age", ascendingAge);
    return ascendingAge;
  }

  public static void printPeople(final String menssage, final List<Person> people) {
    System.out.println(menssage);
    people.forEach(System.out::println);
  }

}
