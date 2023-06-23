package com.functionalPrograming.chapter2

import spock.lang.Specification

class PickALongestSpec extends Specification {

  def ""() {
    given:
    PickALongest service = new PickALongestImpl()
    and:
    List<String> nameList = _nameList
    and:
    def response
    when:
    response = service.pick(nameList)
    then:
    response == _response
    where:
    _nameList                                          | _response
    ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"] | 26
  }
}
