package com.functionalPrograming.chapter6

import spock.lang.Shared
import spock.lang.Specification

class LazyStreamsSpec extends Specification {

  @Shared
    service = new LazyStreams()

  def "Test Lazy Method"() {
    expect:
    service.testLazyMethod()
  }

}
