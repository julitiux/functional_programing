package com.functionalPrograming.chapter4;

import java.math.BigDecimal;

public class CalculateNAVImpl implements CalculateNAV {

  @Override
  public BigDecimal computeStockWorth(String ticket, int shares) {
    return princeFinder.apply(ticket).multiply(BigDecimal.valueOf(shares));
  }

}
