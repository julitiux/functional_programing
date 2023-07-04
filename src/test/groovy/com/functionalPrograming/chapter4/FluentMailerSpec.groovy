package com.functionalPrograming.chapter4

import spock.lang.Shared
import spock.lang.Specification

class FluentMailerSpec extends Specification {

  @Shared
  FluentMailerImpl service = new FluentMailerImpl()

  def "fluent mailer impl"() {
    expect:
    FluentMailerImpl.send { mailer ->
      mailer
        .from("build@agiledeveloper.com")
        .to("venkats@agiledeveloper.com")
        .subject("build notification")
        .body("...much better...")
    }
  }
}
