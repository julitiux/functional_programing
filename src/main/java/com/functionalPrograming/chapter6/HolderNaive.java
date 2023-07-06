package com.functionalPrograming.chapter6;

public class HolderNaive {

  private HeavyImpl heavy;

  public HolderNaive() {
    System.out.println("Holder created");
  }

  public HeavyImpl getHeavy() {
    if (heavy == null) {
      heavy = new HeavyImpl();
    }
    return heavy;
  }


}
