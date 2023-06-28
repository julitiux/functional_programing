package com.functionalPrograming.chapter3;

import java.io.File;

public class ListHiddenFilesImpl implements ListHiddenFiles {

  @Override
  public File[] listHiddenFiles() {
    return new File(".").listFiles(file -> file.isHidden());
  }

}
