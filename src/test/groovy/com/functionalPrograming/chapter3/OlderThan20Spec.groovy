package com.functionalPrograming.chapter3

import spock.lang.Specification

class OlderThan20Spec extends Specification {

  def "find older than 20"() {
    given:
    OlderThan20 service = new OlderThan20Impl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    List<Person> response
    when:
    response = service.olderThan20(personList)
    then:
    response == personList.findAll { person -> person.age > 20 }
  }


  def "people by age"() {
    given:
    OlderThan20 service = new OlderThan20Impl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    Map<Integer, List<Person>> response
    when:
    response = service.peopleByAge(personList)
    then:
    response == personList.groupBy { it.age }
  }

  def "name of people by age"() {
    given:
    OlderThan20 service = new OlderThan20Impl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    Map<Integer, List<String>> response
    when:
    response = service.nameOfPeopleByAge(personList)
    then:
    println response
  }

  def "oldest person of each letter"() {
    given:
    OlderThan20 service = new OlderThan20Impl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    Map<Integer, Optional<Person>> response
    when:
    response = service.odestPersonOfEachLetter(personList)
    then:
    println response
  }

}
