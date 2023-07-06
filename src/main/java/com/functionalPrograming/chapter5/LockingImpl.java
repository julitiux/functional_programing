package com.functionalPrograming.chapter5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.functionalPrograming.chapter5.Locker.runLocked;

public class LockingImpl {

  Lock lock = new ReentrantLock();

  protected void setLock(final Lock mock) {
    lock = mock;
  }

  public void do0p1() {
    lock.lock();
    try {
      // ...critical code
    } finally {
      lock.unlock();
    }
  }

  public void do0p2() {
    runLocked(lock, () -> {/* ...critical code... */});
  }

  public void do0p3() {
    runLocked(lock, () -> {/* ...critical code... */});
  }

  public void do0p4() {
    runLocked(lock, () -> {/* ...critical code... */});
  }
  //...
}
