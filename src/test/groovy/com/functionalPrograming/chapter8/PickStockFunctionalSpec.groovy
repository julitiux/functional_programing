package com.functionalPrograming.chapter8

import spock.lang.Shared
import spock.lang.Specification

class PickStockFunctionalSpec extends Specification {

  @Shared
    instance = new PickStockFunctional()

  def "find High Priced"() {
    expect:
    instance.findHighPriced(Tickets.symbols.stream())
  }


}
