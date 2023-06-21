package com.functionalPrograming.chapter1;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DiscountImprativeImpl implements DiscountImprative {

  @Override
  public BigDecimal totalOfDiscountedPrices(List<BigDecimal> prices) {
    BigDecimal dummmy = BigDecimal.ZERO;
    for (BigDecimal price : prices) {
      dummmy = dummmy.add(price.multiply(BigDecimal.valueOf(0.9)));
    }
    return dummmy;
  }
}
