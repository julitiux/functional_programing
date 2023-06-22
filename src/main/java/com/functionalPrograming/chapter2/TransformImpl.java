package com.functionalPrograming.chapter2;

import java.util.ArrayList;
import java.util.List;

public class TransformImpl implements Transform {

  @Override
  public List<String> transformUpperCase(List<String> nameList) {
    List<String> upperCasesNames = new ArrayList<String>();
    nameList.stream().forEach(name -> upperCasesNames.add(name.toUpperCase()));
    return upperCasesNames;
  }

}
