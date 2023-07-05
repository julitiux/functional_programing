package com.functionalPrograming.chapter5

import spock.lang.Specification

class FileWriterARMSpec extends Specification {

  def "write Stuff"() {
    expect:
    try (FileWriterARM service = new FileWriterARMImpl("peekaboo.txt")) {
      service.writeStuff("other  ssspeek-a-boo")

      println "done with the resource... "
    }

  }

}
