package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrintListImpl implements PrintList {

  @Override
  public String print(List<String> friendList) {
    return friendList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
  }

}
