package com.functionalPrograming.chapter6

import spock.lang.Specification

class PrimesSpec extends Specification {

  def "primes List"() {
    expect:
    println "10 primes from 1  " + Primes.primes(1, 10)
    println "5 primes from 100 " + Primes.primes(100, 5)
  }

}
