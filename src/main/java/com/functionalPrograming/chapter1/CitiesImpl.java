package com.functionalPrograming.chapter1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesImpl implements Cities {
  @Override
  public void cities(List<String> cities) {
    boolean found = false;
    for (String city : cities)
      if (city.equals("Chicago")) {
        found = true;
        break;
      }
    System.out.println("Found Chicago?: " + found);
  }
}
