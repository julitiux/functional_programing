package com.functionalPrograming.chapter2

import spock.lang.Specification

class PickALongestSpec extends Specification {

  def "pick a name of list"() {
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

  def"pick a long name"(){
    given:
    PickALongest service = new PickALongestImpl()
    and:
    List<String> nameList = _nameList
    and:
    def response
    when:
    response = service.pickALongName(nameList)
    then:
    response == _response
    where:
    _nameList                                          | _response
    ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"] | "Brian"
  }
}
