package com.functionalPrograming.chapter2;

import java.util.ArrayList;
import java.util.List;

public class PickElementsImpl implements PickElements {

  @Override
  public List<String> startsWithXLetter(List<String> wordList) {
    final List<String> startsWithN = new ArrayList<>();
    for (String word : wordList) {
      if (word.startsWith("N"))
        startsWithN.add(word);
    }
    return startsWithN;
  }

}
