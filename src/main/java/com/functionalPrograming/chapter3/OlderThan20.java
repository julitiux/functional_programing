package com.functionalPrograming.chapter3;

import java.util.List;
import java.util.Map;

public interface OlderThan20 {
  List<Person> olderThan20(List<Person> personList);
  Map<Integer, List<Person>> peopleByAge(List<Person> personList);
}
