package com.functionalPrograming.chapter7

import spock.lang.Shared
import spock.lang.Specification

class RodCutterBasicSpec extends Specification {

  @Shared
    intance = new RodCutterBasic([2, 1, 1, 2, 2, 2, 1, 8, 9, 15])

  def "intance.maxProfit 5"() {
    expect:
    intance.maxProfit(5)
  }

  def "intance.maxProfit 22"() {
    expect:
    intance.maxProfit(22)
  }
}
