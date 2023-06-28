package com.functionalPrograming.chapter3

import spock.lang.Specification

class ListSelectFilesSpec extends Specification {

  def "get files"() {
    given:
    ListSelectFiles service = new ListSelectFilesImpl()
    String[] response
    when:
    response = service.getfiles()
    then:
    println response
  }

  def "new directory stream"() {
    given:
    ListSelectFiles service = new ListSelectFilesImpl()
    String[] response
    when:
    response = service.newDirectoryStream()
    then:
    println response.each { println it }
  }
}
