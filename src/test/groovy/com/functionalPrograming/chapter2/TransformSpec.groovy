package com.functionalPrograming.chapter2

import spock.lang.Specification

class TransformSpec extends Specification {

  def "transform elements list to uppercase"() {
    given:
    Transform service = new TransformImpl()
    and:
    List<String> nameList = _nameList
    and:
    List<String> response
    when:
    response = service.transformUpperCase(nameList)
    then:
    response == _response
    where:

    _nameList                             | _response
    ['Juanita', 'Calambrita', 'Pedrito'] | ['JUANITA', 'CALAMBRITA', 'PEDRITO']
  }

}
