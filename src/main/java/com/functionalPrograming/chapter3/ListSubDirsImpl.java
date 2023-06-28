package com.functionalPrograming.chapter3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

  @Override
  public List<File> betterWay() {
    return Stream.of(new File(".").listFiles())
      .flatMap(file -> file.listFiles() == null ?
        Stream.of(file) : Stream.of(file.listFiles()))
      .collect(Collectors.toList());
  }

}
