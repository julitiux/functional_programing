package com.functionalPrograming.chapter6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primes {

  public static boolean isPrime(final int number) {
    return number > 1 &&
      IntStream.rangeClosed(2, (int) Math.sqrt(number))
        .noneMatch(divisor -> number % divisor == 0);
  }

  private static int primerAfter(final int number) {
    if (isPrime(number + 1))
      return number + 1;
    else
      return primerAfter(number + 1);
  }

  public static List<Integer> primes(final int fromNumber, final int count) {
    return Stream.iterate(primerAfter(fromNumber - 1), Primes::primerAfter)
      .limit(count)
      .collect(Collectors.<Integer>toList());
  }

}
