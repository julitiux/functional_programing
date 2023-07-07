package com.functionalPrograming.chapter6;

public class Evaluation {

  public static boolean evaluate(final int value) {
    System.out.println("evaluation... " + value);
    simulateTimeConsumingOp(2000);
    return value > 100;
  }
  
}
