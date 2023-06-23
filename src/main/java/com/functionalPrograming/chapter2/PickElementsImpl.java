package com.functionalPrograming.chapter2;

import java.util.List;
import java.util.Optional;
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

  final Function<String, Predicate<String>> startWithLetter = letter -> word -> word.startsWith(letter);

  @Override
  public List<String> startsWithXLetter(List<String> wordList, String startWith) {
    return wordList.stream()
      .filter(startWithLetter.apply(startWith))
      .collect(Collectors.toList());
  }

  @Override
  public String pickName(List<String> nameList, String startingLetter) {
    final Optional<String> foundName =
      nameList.stream()
        .filter(name -> name.startsWith(startingLetter))
        .findFirst();

    System.out.println(String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No Name Found")));
    foundName.ifPresent(name -> System.out.println("Hello " +name));

    return foundName.orElse("No Name Found");
  }

}
