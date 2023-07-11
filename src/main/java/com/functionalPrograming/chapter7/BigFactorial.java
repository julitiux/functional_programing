package com.functionalPrograming.chapter7;

import java.math.BigInteger;

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

}
