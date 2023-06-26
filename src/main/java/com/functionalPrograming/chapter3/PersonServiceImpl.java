package com.functionalPrograming.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonServiceImpl implements PersonService {

  @Override
  public List<Person> ascendingAge(List<Person> personList) {
    List<Person> ascendingAge = personList.stream()
      .sorted(Person::ageDifference)
      .collect(Collectors.toList());

    printPeople("Sorted in ascending order by age", ascendingAge);
    return ascendingAge;
  }

  public static void printPeople(final String menssage, final List<Person> people) {
    System.out.println(menssage);
    people.forEach(System.out::println);
  }

}
