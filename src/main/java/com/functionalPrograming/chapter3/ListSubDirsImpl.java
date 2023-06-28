package com.functionalPrograming.chapter3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSubDirsImpl implements ListSubDirs {

  @Override
  public List<File> listTheHardWay() {
    List<File> files = new ArrayList<>();

    File[] filesInCurrentDir = new File(".").listFiles();
    for (File file : filesInCurrentDir) {
      File[] filesInSubDir = file.listFiles();
      if (filesInSubDir != null) {
        files.addAll(Arrays.asList(filesInSubDir));
      } else {
        files.add(file);
      }
    }

    return files;
  }

}
