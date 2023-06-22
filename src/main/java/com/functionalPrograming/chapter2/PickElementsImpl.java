package com.functionalPrograming.chapter2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PickElementsImpl implements PickElements {

  // THIS WAS MY FIRST PREDICATE
  final Predicate<String> firstPredicate = word -> word.startsWith("N");

  final Predicate<String> startWithPredicate(String start) {
    return it -> it.startsWith(start);
  }

  @Override
  public List<String> startsWithXLetter(List<String> wordList, String startWith) {
    return wordList.stream()
      .filter(startWithPredicate(startWith))
      .collect(Collectors.toList());
  }

}
