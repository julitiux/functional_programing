package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PickALongestImpl implements PickALongest {
  @Override
  public Integer pick(List<String> nameList) {
    Integer dummy = nameList.stream().mapToInt(name -> name.length()).sum();
    System.out.println("Total member of characters in all names: " + dummy);
    return dummy;
  }
}
