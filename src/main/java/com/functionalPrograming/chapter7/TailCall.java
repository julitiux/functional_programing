package com.functionalPrograming.chapter7;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall<T> {

  TailCall<T> apply();

  default boolean isComlete() {
    return false;
  }

  default T result() {
    throw new Error("not implemented");
  }

  default T invoke() {
    return Stream.iterate(this, TailCall::apply)
      .filter(TailCall::isComlete)
      .findFirst()
      .get()
      .result();
  }

}
