package com.functionalPrograming.chapter2;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PickElementsImpl implements PickElements {

  // THIS WAS MY FIRST PREDICATE
  final Predicate<String> firstPredicate = word -> word.startsWith("N");

  // USING LEXICAL SCOPING
  final Predicate<String> startWithPredicate(final String letter) {
    return it -> it.startsWith(letter);
  }

  final Function<String, Predicate<String>> startWithLetter =
    (String letter) -> (String word) -> word.startsWith(letter);

  @Override
  public List<String> startsWithXLetter(List<String> wordList, String startWith) {
    return wordList.stream()
      .filter(startWithLetter.apply(startWith))
      .collect(Collectors.toList());
  }

}
