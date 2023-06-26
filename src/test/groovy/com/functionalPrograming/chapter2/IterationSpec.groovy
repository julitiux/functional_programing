package com.functionalPrograming.chapter2

import spock.lang.Specification

class IterationSpec extends Specification {


  def "iteration"() {
    given:
    Iteration service = new IterationImpl()
    and:
    List nameList = ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"]
    expect:
    service.iteration(nameList)
  }
}
