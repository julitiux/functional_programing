package com.functionalPrograming.chapter5;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEAMImpl implements FileWriterEAM {

  private final FileWriter writer;

  private FileWriterEAMImpl(final String fileName) throws IOException {
    writer = new FileWriter(fileName);
  }

  private void close() throws IOException {
    System.out.println("close called automatically... ");
    writer.close();
  }

  public void writeStuff(final String message) throws IOException {
    writer.write(message);
  }

  public static void use(final String fileName, final UseInstance<FileWriterEAM, IOException> block) throws IOException {
    final FileWriterEAMImpl writerEAM = new FileWriterEAMImpl(fileName);
    try {
      block.accept(writerEAM);
    } finally {
      writerEAM.close();
    }
  }

}
