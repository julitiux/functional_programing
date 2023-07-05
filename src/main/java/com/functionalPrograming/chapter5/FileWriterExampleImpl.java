package com.functionalPrograming.chapter5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExampleImpl implements FileWriterExample {

  private final FileWriter writer;

  public FileWriterExampleImpl(final String fileName) throws IOException {
    this.writer = new FileWriter(fileName);
  }

  public void writeStuff(final String message) throws IOException {
    writer.write(message);
  }

  public void finaliza() throws IOException {
    writer.close();
  }

  @Override
  public void close() throws IOException {
    writer.close();
  }

}
