package com.functionalPrograming.chapter2;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
class IterationImpl implements Iteration {

  @Override
  public void iteration(List<String> stringList) {
    stringList.forEach(new Consumer<String>() {
      @Override
      public void accept(String name) {
        System.out.println(name);
      }
    });


  }
}
