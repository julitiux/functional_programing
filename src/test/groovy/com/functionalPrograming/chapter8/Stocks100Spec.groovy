package com.functionalPrograming.chapter8

import spock.lang.Shared
import spock.lang.Specification

class Stocks100Spec extends Specification {

  @Shared
    instance = new Stocks100()

  def "stocks100"() {
    expect:
    instance.stocks100()
  }
}
