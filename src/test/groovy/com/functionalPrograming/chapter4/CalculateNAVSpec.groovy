package com.functionalPrograming.chapter4


import spock.lang.Specification

class CalculateNAVSpec extends Specification {


  def "compute stock worth"() {
    given:
    CalculateNAV service = new CalculateNAVImpl(_function)
    String ticket = "GOOG"
    int shares = 1000
    BigDecimal response
    when:
    response = service.computeStockWorth(ticket, shares)
    then:
    response == _response
    where:
    _response | _function
    6010.00   | (ticker) -> new BigDecimal("6.01")
  }
}
