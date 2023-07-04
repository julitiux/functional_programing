package com.functionalPrograming.chapter4;

import java.util.function.Consumer;

public class FluentMailerImpl {

  public FluentMailerImpl() {
  }

  public FluentMailerImpl from(final String address) {/*... */
    return this;
  }

  public FluentMailerImpl to(final String address) {/*... */
    return this;
  }

  public FluentMailerImpl subject(final String line) {/*... */
    return this;
  }

  public FluentMailerImpl body(final String message) {/*... */
    return this;
  }

  public static void send(Consumer<FluentMailerImpl> block) {
    FluentMailerImpl mailer = new FluentMailerImpl();
    block.accept(mailer);
    System.out.println("sending...");
  }

}
