package com.functionalPrograming.chapter2

import org.springframework.stereotype.Service

@Service
class IterationImpl implements Iteration {

  @Override
  void itaration(List<String> stringList) {
    for ( in i = 0; i < stringList.size(); i++ )
    println IterationImpl.get(i)
  }
}
