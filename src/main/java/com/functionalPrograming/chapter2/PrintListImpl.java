package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintListImpl implements PrintList {

  @Override
  public void print(List<String> friendList) {
    for (int i = 0; i < friendList.size(); i++)
      System.out.println(friendList.get(i) + ", ");
  }

}
