package com.functionalPrograming.chapter2

import spock.lang.Specification

class PrintListSpec extends Specification{

  def""(){
    given:
    PrintList service = new PrintListImpl()
    and:
    List<String> fiendList = ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"]
    expect:
    service.print(fiendList)
  }
}
