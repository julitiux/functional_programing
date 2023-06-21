package com.functionalPrograming.chapter1;

import java.math.BigDecimal;
import java.util.List;

public interface DiscountImprative {
  BigDecimal totalOfDiscountedPrices(List<BigDecimal> prices);
}