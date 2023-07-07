package com.functionalPrograming.chapter6;

public class LazyStreams {

  private static int length(final String name) {
    System.out.println("getting length for " + name);
    return name.length();
  }
}
