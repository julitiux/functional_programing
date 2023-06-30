package com.functionalPrograming.chapter3

import spock.lang.Specification

class WatchFileChangeSpec extends Specification {

  def "watch file change"() {
    setup:
    WatchFileChange service = new WatchFileChangeImpl()
    expect:
    service.watchFileChange()
  }
}
