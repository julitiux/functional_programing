package com.functionalPrograming.chapter4;

import java.math.BigDecimal;

public interface CalculateNAV {
  BigDecimal computeStockWorth(String ticket, int shares);
}
