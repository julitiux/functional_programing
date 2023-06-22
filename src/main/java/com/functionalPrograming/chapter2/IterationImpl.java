package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class IterationImpl implements Iteration {

  @Override
  public void iteration(List<String> stringList) {
    stringList.forEach(System.out::println);
  }
}
