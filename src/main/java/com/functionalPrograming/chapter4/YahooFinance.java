package com.functionalPrograming.chapter4;

import java.math.BigDecimal;

public interface YahooFinance {
  BigDecimal getPrice(String ticket);
}
