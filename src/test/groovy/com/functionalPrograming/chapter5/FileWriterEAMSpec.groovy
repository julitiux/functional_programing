package com.functionalPrograming.chapter5

import spock.lang.Specification

class FileWriterEAMSpec extends Specification {

  def "use FileWriterEAMImpl"() {
    expect:
    FileWriterEAMImpl.use("eam.txt", writterEAM -> writterEAM.writeStuff("sweet"))
  }

  def "use FileWriterEAMImpl many lambdas"() {
    expect:
    FileWriterEAMImpl.use("eam2.txt", writterEAM -> {
      writterEAM.writeStuff("how")
      writterEAM.writeStuff("sweet")
    })
  }

}
