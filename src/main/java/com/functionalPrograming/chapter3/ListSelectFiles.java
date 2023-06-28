package com.functionalPrograming.chapter3;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;

public interface ListSelectFiles {

  String[] getfiles();
  DirectoryStream<Path> newDirectoryStream() throws IOException;

}
