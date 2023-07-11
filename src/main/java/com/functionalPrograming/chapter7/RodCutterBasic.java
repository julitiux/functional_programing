package com.functionalPrograming.chapter7;

import java.util.List;

public class RodCutterBasic {

  final List<Integer> prices;

  public RodCutterBasic(final List<Integer> pricesForLength) {
    prices = pricesForLength;
  }

  public int maxProfit(final int length) {
    int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
    for (int i = 1; i < length; i++) {
      int priceWhenCut = maxProfit(i) + maxProfit(length - 1);
      if (profit < priceWhenCut) profit = priceWhenCut;
    }

    return profit;
  }


}
