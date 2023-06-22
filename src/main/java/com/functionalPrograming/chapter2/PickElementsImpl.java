package com.functionalPrograming.chapter2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PickElementsImpl implements PickElements {

  // THIS WAS MY FIRST PREDICATE
  final Predicate<String> firstPredicate = word -> word.startsWith("N");

  @Override
  public List<String> startsWithXLetter(List<String> wordList, String startWith) {
    return wordList.stream()
      .filter(firstPredicate)
      .collect(Collectors.toList());
  }

}
