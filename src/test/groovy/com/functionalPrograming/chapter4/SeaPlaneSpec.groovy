package com.functionalPrograming.chapter4

import spock.lang.Shared
import spock.lang.Specification

class SeaPlaneSpec extends Specification {

  @Shared
  SeaPlaneImpl service = new SeaPlaneImpl()

  def "sea plane implement"() {
    expect:
    service.takeOff()
    service.turn()
    service.cruise()
    service.land()
  }

}
