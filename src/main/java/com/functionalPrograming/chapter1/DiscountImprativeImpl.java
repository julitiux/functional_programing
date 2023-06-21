package com.functionalPrograming.chapter1;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DiscountImprativeImpl implements DiscountImprative {

  @Override
  public BigDecimal totalOfDiscountedPrices(List<BigDecimal> prices) {
    return prices.stream()
      .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
      .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
      .reduce(BigDecimal.ZERO, BigDecimal::add);
  }
}
