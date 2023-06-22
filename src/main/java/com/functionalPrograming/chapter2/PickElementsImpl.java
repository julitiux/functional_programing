package com.functionalPrograming.chapter2;

import java.util.List;
import java.util.stream.Collectors;

public class PickElementsImpl implements PickElements {

  @Override
  public List<String> startsWithXLetter(List<String> wordList, String startWtih) {
    return wordList.stream()
      .filter(word -> word.startsWith(startWtih))
      .collect(Collectors.toList());
  }

}
