package com.functionalPrograming.chapter6

import com.functionalPrograming.chapter6.HolderNaive
import spock.lang.Specification

class HolderNaiveSpec extends Specification {

  def "deferring heavy creation"() {
    setup:
    HolderNaive holver = new HolderNaive()
    expect:
    println "deferring heavy creation..."
    println holver.getHeavy()
    println holver.getHeavy()

  }

}
