package com.functionalPrograming.chapter1

import spock.lang.Specification

class CitiesSpec extends Specification{

  def "Given a name"(){
    given:
    Cities cities = new CitiesImpl()
    and:
    List<String> citiesList = ["Chicago", "New York", "Cansas"]
    when:
    cities.cities(citiesList)
    then:
    true
  }

}
