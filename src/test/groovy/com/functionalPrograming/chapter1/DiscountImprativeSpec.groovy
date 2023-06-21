package com.functionalPrograming.chapter1

import spock.lang.Specification

class DiscountImprativeSpec extends Specification {

  def ""() {
    given:
    DiscountImprative service = new DiscountImprativeImpl()
    and:
    List<BigDecimal> prices = [new BigDecimal("10"), new BigDecimal(30), new BigDecimal(17), new BigDecimal(20), new BigDecimal(15), new BigDecimal(18), new BigDecimal(45), new BigDecimal(12)]
    and:
    def response
    when:
    response = service.totalOfDiscountedPrices(prices)
    then:
    println response
    response
  }
}
