package com.functionalPrograming.chapter8;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class Stocks100 {


  public void stocks100() {
    final BigDecimal HUNDRED = new BigDecimal("100");
    System.out.println("Stocks priced over 100 are " +
      Tickets.symbols
        .stream()
        .filter(
          symbol -> YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0)
        .sorted()
        .collect(Collectors.joining(", "))
    );
  }

}
