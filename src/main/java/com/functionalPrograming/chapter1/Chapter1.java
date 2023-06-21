package com.functionalPrograming.chapter1;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class Chapter1 {

  public String firstMethod() {
    List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"), new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"), new BigDecimal("45"), new BigDecimal("12"));
    prices.stream()
      .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
      .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
      .reduce(BigDecimal.ZERO, BigDecimal::add);
    return "the method";
  }


  public Integer secondMethod() {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    return integerList.stream().map(number -> number * 3).reduce(0, Integer::sum);

  }

}
