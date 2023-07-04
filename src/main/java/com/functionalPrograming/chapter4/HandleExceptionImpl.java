package com.functionalPrograming.chapter4;

import java.io.File;
import java.util.stream.Stream;

public class HandleExceptionImpl implements HandleException{

  @Override
  public void handleException() {
    Stream.of("/usr", "/tmp")
      .map(path -> new File(path).getCanonicalPath())
      .forEach(System.out::println);
  }

}
