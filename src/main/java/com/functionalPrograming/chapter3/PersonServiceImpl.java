package com.functionalPrograming.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonServiceImpl implements PersonService {

  Comparator<Person> compareAscending = Person::ageDifference;
  Comparator<Person> compareDescending = compareAscending.reversed();

  @Override
  public List<Person> ascendingAge(List<Person> personList) {
    List<Person> ascendingAge = personList.stream()
      .sorted(Person::ageDifference)
      .collect(Collectors.toList());

    printPeople("Sorted in descending order by age", ascendingAge);
    return ascendingAge;
  }

  @Override
  public List<Person> descendingAge(List<Person> personList) {
    return personList.stream()
      .sorted((person1, person2) -> person2.ageDifference(person1))
      .collect(Collectors.toList());
  }

  public static void printPeople(final String menssage, final List<Person> people) {
    System.out.println(menssage);
    people.forEach(System.out::println);
  }

}
