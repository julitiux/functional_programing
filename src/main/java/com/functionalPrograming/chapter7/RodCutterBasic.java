package com.functionalPrograming.chapter7;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static com.functionalPrograming.chapter7.Memoizer.callMemoized;

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

  public int maxProfit2(final int rodLength) {
    BiFunction<Function<Integer, Integer>, Integer, Integer> compute = (func, length) -> {
      int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
      for (int i = 1; i < length; i++) {
        int priceWhenCut = func.apply(i) + func.apply(length - i);
        if (profit < priceWhenCut) profit = priceWhenCut;
      }
      return profit;
    };
    return callMemoized(compute, rodLength);
  }


}
