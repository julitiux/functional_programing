package com.functionalPrograming.chapter4;

import java.math.BigDecimal;
import java.util.function.Function;

public class CalculateNAVImpl implements CalculateNAV {

  public CalculateNAVImpl(Function<String, BigDecimal> princeFinder) {
    this.princeFinder = princeFinder;
  }

  Function<String,BigDecimal> princeFinder;

  @Override
  public BigDecimal computeStockWorth(String ticket, int shares) {
    return princeFinder.apply(ticket).multiply(BigDecimal.valueOf(shares));
  }

}
