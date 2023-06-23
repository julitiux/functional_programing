package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintListImpl implements PrintList {

  @Override
  public String print(List<String> friendList) {
    return String.join(", ", friendList);
  }

}
