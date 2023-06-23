package com.functionalPrograming.chapter2;

import java.util.List;

public interface PickElements {
  List<String> startsWithXLetter(List<String> wordList, String startWtih);
  String pickName(List<String> nameList, String startingLetter);

}
