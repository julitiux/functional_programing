package com.functionalPrograming.chapter2

import spock.lang.Specification

class PrintListSpec extends Specification {

  def "print a list uppercase"() {
    given:
    PrintList service = new PrintListImpl()
    and:
    List<String> friendList = _friendList
    and:
    String response
    when:
    response = service.print(friendList)
    then:
    response == _response
    where:
    _friendList                                        | _response
    ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"] | "BRIAN, NATE, NEAL, RAJU, SARA, SCOTT"
  }
}
