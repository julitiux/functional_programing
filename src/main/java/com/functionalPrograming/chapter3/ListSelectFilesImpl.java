package com.functionalPrograming.chapter3;

import java.io.File;

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

}
