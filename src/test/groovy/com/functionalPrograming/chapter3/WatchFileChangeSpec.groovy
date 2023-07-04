package com.functionalPrograming.chapter3

import spock.lang.Ignore
import spock.lang.Specification

class WatchFileChangeSpec extends Specification {

  @Ignore
  def "watch file change"() {
    setup:
    WatchFileChange service = new WatchFileChangeImpl()
    expect:
    service.watchFileChange()
  }
}
