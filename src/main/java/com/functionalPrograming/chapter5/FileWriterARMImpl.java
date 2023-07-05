package com.functionalPrograming.chapter5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterARMImpl implements FileWriterARM {

  private final FileWriter writer;

  public FileWriterARMImpl(final String fileName) throws IOException {
    writer = new FileWriter(fileName);
  }

  @Override
  public void writeStuff(String message) throws IOException {
    writer.write(message);
  }

  @Override
  public void close() throws IOException {
    System.out.println("close called automatically... ");
    writer.close();
  }
}
