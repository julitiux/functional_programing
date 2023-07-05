package com.functionalPrograming.chapter5;

import java.io.IOException;

public interface FileWriterARM {

  public void writeStuff(final String message) throws IOException;
  public void close() throws IOException;
}
