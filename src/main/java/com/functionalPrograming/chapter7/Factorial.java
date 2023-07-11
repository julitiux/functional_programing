package com.functionalPrograming.chapter7;

import static com.functionalPrograming.chapter7.TailCalls.call;
import static com.functionalPrograming.chapter7.TailCalls.done;


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


  public static int factorial(final int number){
    return factorialTailRec(1, number).invoke();
  }

}