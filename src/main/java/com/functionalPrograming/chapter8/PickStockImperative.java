package com.functionalPrograming.chapter8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PickStockImperative {


  public void imperativeStyle() {
    final List<StockInfo> stocks = new ArrayList<>();
    for (String symbol : Tickets.symbols) {
      stocks.add(StockUtil.getPrice(symbol));
    }

    final List<StockInfo> stocksPriceInder500 = new ArrayList<>();
    final Predicate<StockInfo> isPreceLessThan500 = StockUtil.isPriceLessThan(500);
    for (StockInfo stock : stocks) {
      if (isPreceLessThan500.test(stock))
        stocksPriceInder500.add(stock);
    }

    StockInfo highPriced = new StockInfo("", BigDecimal.ZERO);
    for (StockInfo stock : stocksPriceInder500) {
      highPriced = StockUtil.pickHigh(highPriced, stock);
    }

    System.out.println("High priced under $500 is " + highPriced);

  }


}
