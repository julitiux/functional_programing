package com.functionalPrograming.chapter2;

import java.util.List;
import java.util.stream.Collectors;

public class TransformImpl implements Transform {

  @Override
  public List<String> transformUpperCase(List<String> nameList) {
    return nameList.stream()
      .map(name -> name.toUpperCase())
      .collect(Collectors.toList());
  }

}
