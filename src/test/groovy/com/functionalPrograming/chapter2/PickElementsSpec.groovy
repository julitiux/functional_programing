package com.functionalPrograming.chapter2

import spock.lang.Specification

class PickElementsSpec extends Specification {

  def "starts with x letter"() {
    given:
    PickElements service = new PickElementsImpl()
    and:
    List<String> wordList = _wordList
    and:
    String startWtih = _startWtih
    and:
    List<String> response
    when:
    response = service.startsWithXLetter(wordList, startWtih)
    then:
    response == _response
    where:
    _wordList                                          | _startWtih | _response
    ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"] | "N"        | ["Nate", "Neal"]
    ["Brian", "Jackie", "John", "Mike"]                | "N"        | []
    ["Kate", "Ken", "Nick", "Paula", "Zach"]           | "N"        | ["Nick"]
  }

  def "pick a name of list"() {
    given:
    PickElements service = new PickElementsImpl()
    and:
    List<String> nameList = _nameList
    and:
    String startingLetter = _startingLetter
    and:
    def response
    when:
    response = service.pickName(nameList, startingLetter)
    then:
    response == _response
    where:
    _nameList                                          | _startingLetter | _response
    ["Brian", "Nate", "Neal", "Raju", "Sara", "Scott"] | "N"             | "Nate"
    ["Brian", "Jackie", "John", "Mike"]                | "N"             | "No Name Found"
    ["Kate", "Ken", "Nick", "Paula", "Zach"]           | "N"             | "Nick"
  }

}
