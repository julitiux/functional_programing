package com.functionalPrograming.chapter4

import spock.lang.Shared
import spock.lang.Specification

class MailBuilderSpec extends Specification {

  @Shared
  MailBuilderImpl service = new MailBuilderImpl()

  def "mail builder impl"() {
    expect:
    new MailBuilderImpl()
      .from("build@agiledeveloper.com")
      .to("venkats@agiledeveloper.com")
      .subject("build notification")
      .body("...it sucks less...")
      .send()
  }
}
