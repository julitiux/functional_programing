package com.functionalPrograming.chapter3;

public class IterateStringImpl implements IterateString {

  @Override
  public void iterateString(String string) {
    string.chars().forEach(System.out::println);
  }

  private static void printChar(int aChar) {
    System.out.println((char) aChar);
  }

}
