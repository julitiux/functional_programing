package com.functionalPrograming.chapter3

import spock.lang.Specification

class ListHiddenFilesSpec extends Specification{

  def "list hidden files"() {
    given:
    ListHiddenFiles service = new ListHiddenFilesImpl()
    File[] response
    when:
    response = service.listHiddenFiles()
    then:
    println response.each { println it }
  }

}
