package com.functionalPrograming.chapter3

import spock.lang.Specification

class PersonServiceSpec extends Specification {

  def "sort ascending age"() {
    given:
    PersonService service = new PersonServiceImpl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    List<Person> response
    when:
    response = service.ascendingAge(personList)
    then:
    response == personList.sort { person1, person2 -> person1.age <=> person2.age }
  }

  def "sort descending age"() {
    given:
    PersonService service = new PersonServiceImpl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    List<Person> response
    when:
    response = service.descendingAge(personList)
    then:
    response == personList.sort { person1, person2 -> person2.age <=> person1.age }
  }


  def "youngest"() {
    given:
    PersonService service = new PersonServiceImpl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    Person response
    when:
    response = service.youngest(personList)
    then:
    response == personList.min { it.getAge() }
  }

  def "eldest"() {
    given:
    PersonService service = new PersonServiceImpl()
    List<Person> personList = Arrays.asList(new Person("Greg", 35), new Person("Jhon", 20), new Person("Sara", 21), new Person("Jane", 21))
    Person response
    when:
    response = service.eldest(personList)
    then:
    response == personList.max { it.getAge() }
  }
}
