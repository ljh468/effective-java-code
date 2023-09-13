package org.effective.section02.item08.cleaner;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerIsNotGood {

  public static void main(String[] args) throws InterruptedException {
    Cleaner cleaner = Cleaner.create();

    // 사용하고 싶은 객체
    List<Object> resourceToCleanUp = new ArrayList<>();
    BigObject bigObject = new BigObject(resourceToCleanUp);

    // 등록 // BigObject의 Runable을 사용해서 정리
    cleaner.register(bigObject, new BigObject.ResourceCleaner(resourceToCleanUp));

    bigObject = null;
    System.gc();
    Thread.sleep(3000L);
  }
}