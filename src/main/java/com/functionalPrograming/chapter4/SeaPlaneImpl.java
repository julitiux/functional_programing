package com.functionalPrograming.chapter4;

public class SeaPlaneImpl extends Vehicle implements FastFly, Sail {

  private int altitude;

  @Override
  public void cruise() {
    System.out.println("SeaPlane::cruise currently cruise like: ");
    if (altitude > 0)
      FastFly.super.cruise();
    else
      Sail.super.cruise();
  }

}
