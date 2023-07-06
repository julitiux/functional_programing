package com.functionalPrograming.chapter5

import spock.lang.Specification

class FileWriterEAMSpec extends Specification {

  def "use FileWriterEAMImpl"() {
    expect:
    FileWriterEAMImpl.use("eam.txt", writterEAM -> writterEAM.writeStuff("sweet"))
  }

}
