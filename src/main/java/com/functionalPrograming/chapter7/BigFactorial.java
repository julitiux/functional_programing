package com.functionalPrograming.chapter7;

import java.math.BigInteger;

import static com.functionalPrograming.chapter7.TailCalls.call;
import static com.functionalPrograming.chapter7.TailCalls.done;

public class BigFactorial {

  public static BigInteger decrement(final BigInteger number) {
    return number.subtract(BigInteger.ONE);
  }

  public static BigInteger multiply(final BigInteger first, final BigInteger second) {
    return first.multiply(second);
  }

  final static BigInteger ONE = BigInteger.ONE;
  final static BigInteger FIVE = new BigInteger("5");
  final static BigInteger TWENTK = new BigInteger("20000");

  public static TailCall<BigInteger> factorialTailRec(final BigInteger factorial, final BigInteger number) {
    if (number.equals(BigInteger.ONE))
      return done(factorial);
    else
      return call(() -> factorialTailRec(multiply(factorial, number), decrement(number)));
  }

}
