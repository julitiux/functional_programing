package com.functionalPrograming.chapter1


import spock.lang.Specification

class Chapter1Spec extends Specification {

  def "test"() {
    given:
    Chapter1 chapter1 = new Chapter1()
    when:
    println chapter1.secondMethod()
    then:
    true

  }

}
