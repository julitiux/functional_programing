package com.functionalPrograming.chapter4

import spock.lang.Shared
import spock.lang.Specification

class MailerSpec extends Specification {

  @Shared
  MailerImpl service = new MailerImpl()

  def "mailer"() {
    expect:
    service.from("build@agiledeveloper.com")
    service.to("venkats@agiledeveloper.com")
    service.subject("build notification")
    service.body("...your code sucks...")
    service.send()
  }

}
