package com.functionalPrograming.chapter3;

public class IterateStringImpl implements IterateString {

  @Override
  public void iterateString(String string) {
    string.chars()
      .filter(it -> Character.isDigit(it))
      .forEach(it -> printChar(it));
  }

  private static void printChar(int aChar) {
    System.out.println((char) aChar);
  }

}
