package com.functionalPrograming.chapter8

import spock.lang.Shared
import spock.lang.Specification

class PickStockImperativeSpec extends Specification {

  @Shared
    instance = new PickStockImperative()

  def "imperative Style"() {
    expect:
    instance.imperativeStyle()
  }

}
