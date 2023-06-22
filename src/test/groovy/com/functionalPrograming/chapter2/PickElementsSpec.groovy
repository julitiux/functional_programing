package com.functionalPrograming.chapter2

import spock.lang.Specification

class PickElementsSpec extends Specification {

  def ""() {
    given:
    PickElements service = new PickElementsImpl()
    and:
    List<String> wordList = _wordList
    and:
    List<String> response
    when:
    response = service.startsWithXLetter(wordList)
    then:
    response == _response
    where:
    _wordList                                          | _response
    ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"] | ["Nate", "Neal"]
  }

}
