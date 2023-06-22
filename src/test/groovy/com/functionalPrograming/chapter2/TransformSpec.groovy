package com.functionalPrograming.chapter2

import spock.lang.Specification

class TransformSpec extends Specification {

  def ""() {
    given:
    Transform service = new TransformImpl()
    and:
    List<String> nameList = ['Juanita', 'Calambrita',' Pedrito']
    and:
    List<String> response
    when:
    response = service.transformUpperCase(nameList)
    then:
    println response
    response
  }

}
