package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PickALongestImpl implements PickALongest {
  @Override
  public Integer pick(List<String> nameList) {
    Integer dummy = nameList.stream().mapToInt(name -> name.length()).sum();
    System.out.println("Total member of characters in all names: " + dummy);
    return dummy;
  }

  @Override
  public String pickALongName(List<String> nameList) {
    Optional<String> aLongName = nameList.stream().reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
    aLongName.ifPresent(name -> System.out.println("A longest name: " + name));
    return aLongName.orElse("NO ONE");
  }
}
