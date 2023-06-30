package com.functionalPrograming.chapter3;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class WatchFileChangeImpl implements WatchFileChange {

  @Override
  public void watchFileChange() throws IOException, InterruptedException {
    Path path = Paths.get(".");
    WatchService watchService = path.getFileSystem().newWatchService();

    path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
    System.out.println("Report any file changed within next 1 minute...");

    WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);
    if (watchKey != null) {
      watchKey.pollEvents()
        .stream()
        .forEach(event -> System.out.println(event.context()));
    }
  }

}
