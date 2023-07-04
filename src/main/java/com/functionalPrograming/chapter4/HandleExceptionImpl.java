package com.functionalPrograming.chapter4;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

public class HandleExceptionImpl implements HandleException{

  @Override
  public void handleException() {
    Stream.of("/usr", "/tmp")
      .map(path -> {
        try {
          return new File(path).getCanonicalPath();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      })
      .forEach(System.out::println);
  }

}
