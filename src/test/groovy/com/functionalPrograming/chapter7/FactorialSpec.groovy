package com.functionalPrograming.chapter7

import spock.lang.Shared
import spock.lang.Specification

class FactorialSpec extends Specification {

  @Shared
    instance = new Factorial()

  def "factorialRec"() {
    expect:
    println instance.factorialRec(10)
  }

}
