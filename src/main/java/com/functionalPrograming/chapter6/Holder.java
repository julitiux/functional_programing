package com.functionalPrograming.chapter6;

import java.util.function.Supplier;

public class Holder {
  private Supplier<Heavy> heavy = () -> createAndCacheHeavy();

  public Holder(){
    System.out.println("Holder created");
  }

  public Heavy getHeavy(){
    return heavy.get();
  }

}
