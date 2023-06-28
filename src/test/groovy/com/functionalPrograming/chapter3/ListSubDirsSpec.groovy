package com.functionalPrograming.chapter3

import spock.lang.Specification

class ListSubDirsSpec extends Specification {

  def "list the hard way"() {
    given:
    ListSubDirs service = new ListSubDirsImpl()
    List<File> response
    when:
    response = service.listTheHardWay()
    then:
    println response.each { println it }
    response
  }


  def "better way"() {
    given:
    ListSubDirs service = new ListSubDirsImpl()
    List<File> response
    when:
    response = service.betterWay()
    then:
    println response.each { println it }
    response
  }

}
