package com.functionalPrograming.chapter6


import spock.lang.Specification

class LazyStreamsSpec extends Specification {

  def "Test Lazy Method"() {
    given:
    LazyStreams service = new LazyStreams()
    expect:
    service.testLazyMethod()
  }

  def "other test on Groovy"() {
    given:
    def instance = new LazyStreamsGRoovy()
    expect:
    instance.testLazyMethods()
  }

}


class LazyStreamsGRoovy {

  int length(String name) {
    println "getting length for " + name
    name.length()
  }

  String toUpper(String name) {
    println "converting to uppercase: " + name
    name.toUpperCase()
  }

  void testLazyMethods() {
    List names = ["Brad", "Kate", "Kim", "Jack", "Joe", "Mike", "Susan", "George", "Robert", "Julia", "Parker", "Benson"]
    def namesWith3Letters = names.find { name -> length(name) == 3 }
    println "zzz Stream created, filtered, mapped..."
    println "zzz ready to call findFirst..."
    println namesWith3Letters
  }

}