package com.functionalPrograming.chapter3;

public class IterateStringImpl implements IterateString {

  @Override
  public void iterateString(String string) {
    string.chars()
      .mapToObj( it -> (char) it)
      .forEach(System.out::println);
  }

  private static void printChar(int aChar) {
    System.out.println((char) aChar);
  }

}
