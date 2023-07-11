package com.functionalPrograming.chapter7;

import static fpij.TailCalls.call;
import static fpij.TailCalls.done;


public class Factorial {

  public static int factorialRec(final int number) {
    if (number == 1)
      return number;
    else
      return number * factorialRec(number - 1);
  }


  public static TailCall<Integer> factorialTailRec(final int factorial, final int number) {
    if (number == 1)
      return done(factorial);
    else
      return call(() -> factorialTailRec(factorial * number, number - 1));
  }

}