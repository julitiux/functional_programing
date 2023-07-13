package com.functionalPrograming.chapter8;

import java.math.BigDecimal;

public class StockInfo {

  public final String ticker;
  public final BigDecimal price;

  public StockInfo(final String symbol, final BigDecimal thePrice) {
    ticker = symbol;
    price = thePrice;
  }

  public String toString() {
    return String.format("ticker: %s price %g ", ticker, price);
  }

  public String getTicker() {
    return ticker;
  }

  public BigDecimal getPrice() {
    return price;
  }
}
