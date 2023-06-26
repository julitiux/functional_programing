package com.functionalPrograming.chapter3;

public class IterateStringImpl implements IterateString {

  @Override
  public void iterateString(String string) {
    string.chars()
      .filter(Character::isDigit)
      .forEach(IterateStringImpl::printChar);
  }

  private static void printChar(int aChar) {
    System.out.println((char) aChar);
  }

}
