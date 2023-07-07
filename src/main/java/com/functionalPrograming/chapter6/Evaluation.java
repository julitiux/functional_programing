package com.functionalPrograming.chapter6;

public class Evaluation {

  public static boolean evaluate(final int value) {
    System.out.println("evaluation... " + value);
    //simulateTimeConsumingOp(2000);
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return value > 100;
  }

  public static void eagerEvaluator(final boolean input1, final boolean input2) {
    System.out.println("eagerEvaluaor called... ");
    System.out.println("accept?: " + (input1 && input2));
  }

}
