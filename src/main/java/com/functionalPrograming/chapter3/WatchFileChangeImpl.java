package com.functionalPrograming.chapter3;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;

public class WatchFileChangeImpl implements WatchFileChange{

  @Override
  public void watchFileChange() throws IOException {
    Path path = Paths.get(".");
    WatchService watchService = path.getFileSystem().newWatchService();

    path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
  }

}
