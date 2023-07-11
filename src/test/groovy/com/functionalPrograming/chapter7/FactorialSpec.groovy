package com.functionalPrograming.chapter7

import spock.lang.Shared
import spock.lang.Specification

class FactorialSpec extends Specification {

  @Shared
    factorialInstance = new Factorial()

  @Shared
    bigIntegerInstance = new BigFactorial()


  def "factorialInstance.factorialRec"() {
    expect:
    println factorialInstance.factorialRec(10)
  }


  def "factorialInstance.factorialTailRec"() {
    expect:
    println factorialInstance.factorialTailRec(1, 200010).invoke()
  }

  def "bigIntegerInstance.factorial"() {
    expect:
    println bigIntegerInstance.factorial(new BigInteger("20000"))
  }

}
