package com.functionalPrograming.chapter4


import spock.lang.Specification

class CalculateNAVSpec extends Specification {


  def "compute stock worth"() {
    given:
    CalculateNAV service = new CalculateNAVImpl((ticker) -> new BigDecimal("6.01"))
    String ticket = "GOOasdasdG"
    int shares = 1000
    BigDecimal response
    when:
    response = service.computeStockWorth(ticket, shares)
    then:
    println response

  }
}
