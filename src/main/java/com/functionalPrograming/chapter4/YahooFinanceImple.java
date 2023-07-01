package com.functionalPrograming.chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

public class YahooFinanceImple implements YahooFinance {
  @Override
  public BigDecimal getPrice(String ticket) {
    URL url = null;
    try {
      url = new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticket);

      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      String data = reader.lines().skip(1).findFirst().get();
      String[] dataItems = data.split(",");
      return new BigDecimal(dataItems[dataItems.length - 1]);
    } catch (Exception e) {
      throw new RuntimeException();
    }

    return null;
  }
}
