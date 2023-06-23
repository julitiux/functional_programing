package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintListImpl implements PrintList {

  @Override
  public void print(List<String> friendList) {
    for (int i = 0; i < friendList.size() - 1; i++)
      System.out.print(friendList.get(i) + ", ");

    if (friendList.size() > 0)
      System.out.println(friendList.get(friendList.size() - 1));
  }

}
