package com.functionalPrograming.chapter8

import spock.lang.Shared
import spock.lang.Specification

class PickStockImpreativeClubbedSpec extends Specification {

  @Shared
    instance = new PickStockImpreativeClubbed()

  def "imperative Clubbed Style"() {
    expect:
    instance.imperativeClubbedStyle()
  }

}
