package com.functionalPrograming.chapter4;

public class MailBuilderImpl {
  public MailBuilderImpl from(final String address) {/*... */
    return this;
  }

  public MailBuilderImpl to(final String address) {/*... */
    return this;
  }

  public MailBuilderImpl subject(final String line) {/*... */
    return this;
  }

  public MailBuilderImpl body(final String message) {/*... */
    return this;
  }

  public void send() {
    System.out.println("sending...");
  }
}
