package com.functionalPrograming.chapter5;

import java.io.IOException;

public interface FileWriterExample {

  void writeStuff(final String message) throws IOException;
  void finaliza() throws IOException;

}
