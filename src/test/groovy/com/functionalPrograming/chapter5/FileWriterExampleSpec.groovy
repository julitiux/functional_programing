package com.functionalPrograming.chapter5

import spock.lang.Specification

class FileWriterExampleSpec extends Specification {

  def "write stuff"() {
    given:
    FileWriterExample service = new FileWriterExampleImpl("peekaboo.txt")
    expect:
    service.writeStuff("peek-a-boo")
    service.close()
  }

}
