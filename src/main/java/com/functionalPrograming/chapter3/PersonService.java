package com.functionalPrograming.chapter3;

import java.util.List;

public interface PersonService {
  List<Person> ascendingAge(List<Person> personList);
  List<Person> descendingAge(List<Person> personList);

  Person youngest(List<Person> personList);
  Person eldest(List<Person> personList);

  List<Person> acendingByAgeAndName(List<Person> personList);
}
