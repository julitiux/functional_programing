package com.functionalPrograming.chapter3;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface OlderThan20 {
  List<Person> olderThan20(List<Person> personList);
  Map<Integer, List<Person>> peopleByAge(List<Person> personList);
  Map<Integer, List<String>> nameOfPeopleByAge(List<Person> personList);
  Map<Character, Optional<Person>> odestPersonOfEachLetter(List<Person> personList);
}
