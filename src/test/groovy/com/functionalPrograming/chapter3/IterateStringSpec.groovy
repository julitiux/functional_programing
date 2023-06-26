package com.functionalPrograming.chapter3

import spock.lang.Specification

class IterateStringSpec extends Specification {

  def "iterate a string"() {
    setup:
    IterateString iterateString = new IterateStringImpl()
    expect:
    String string = "w00t"
    iterateString.iterateString(string)
  }

}
