package com.functionalPrograming.chapter8;

import java.math.BigDecimal;
import java.util.function.Predicate;

public class StockUtil {

  public static StockInfo getPrice(final String ticker) {
    return new StockInfo(ticker, YahooFinance.getPrice(ticker));
  }

  public static Predicate<StockInfo> isPriceLessThan(final int price) {
    return stockInfo -> stockInfo.price.compareTo(BigDecimal.valueOf(price)) < 0;
  }

}
