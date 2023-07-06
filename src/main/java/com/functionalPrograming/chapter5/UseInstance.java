package com.functionalPrograming.chapter5;

@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
  void accept(T instance) throws X;
}
