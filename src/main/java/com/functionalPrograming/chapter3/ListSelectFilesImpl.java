package com.functionalPrograming.chapter3;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListSelectFilesImpl implements ListSelectFiles{

  @Override
  public String[] getfiles() {
    return new File("user.dir").list(new java.io.FilenameFilter(){
      @Override
      public boolean accept(File dir, String name) {
        return name.endsWith("*.*");
      }
    });
  }

  @Override
  public DirectoryStream<Path> newDirectoryStream() throws IOException {
    return Files.newDirectoryStream(
      Paths.get("."), path -> path.toString().endsWith("java")
    );
  }

}
