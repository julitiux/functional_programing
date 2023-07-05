package com.functionalPrograming.chapter4;

import java.io.IOException;

public interface FileWriterExample {

  void writeStuff(final String message) throws IOException;
  void finaliza() throws IOException;

}
