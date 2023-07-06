package com.functionalPrograming.chapter5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
  //...
}
