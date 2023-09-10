package org.effective.section02.item07.cache;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryTest {

  @Test
  void cache() throws InterruptedException {
    PostRepository postRepository = new PostRepository();
    // Integer p1 = 1;
    CacheKey key1 = new CacheKey(1);
    // 객체를 만들지 않고, Integer와 같은 타입으로 넘겨주면 강한 참조가 되서 제거되지 않음
    // 한번 객체로 감싸서 WeakHashMap의 key로 사용해야 한다.
    postRepository.getPostById(key1);

    // cache에 남아있음
    System.out.println("getCache().isEmpty() = " + postRepository.getCache().isEmpty());
    assertFalse(postRepository.getCache().isEmpty());

    // CacheKey 참조를 제거
    key1 = null;

    // TODO run gc
    System.out.println("run gc");
    System.gc();
    System.out.println("wait");
    Thread.sleep(3000L);

    // cache는 비어 있게됨
    System.out.println("getCache().isEmpty() = " + postRepository.getCache().isEmpty());
    assertTrue(postRepository.getCache().isEmpty());
  }


  @Test
  void backgroundThread() throws InterruptedException {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    PostRepository postRepository = new PostRepository();
    CacheKey key1 = new CacheKey(1);
    postRepository.getPostById(key1);

    // Runnable 객체를 활용하여 백그라운드 쓰레드 실행
    Runnable removeOldCache = () -> {
      System.out.println("running removeOldCache task");
      Map<CacheKey, Post> cache = postRepository.getCache();
      Set<CacheKey> cacheKeys = cache.keySet();
      Optional<CacheKey> key = cacheKeys.stream().min(Comparator.comparing(CacheKey::getCreated));
      key.ifPresent((k) -> {
        System.out.println("removing " + k);
        cache.remove(k);
      });
    };

    System.out.println("The time is : " + new Date());
    // 처음은 1초 있다가 실행, 이후 3초마다 쓰레드 실행
    executor.scheduleAtFixedRate(removeOldCache,
                                 1, 3, TimeUnit.SECONDS);

    Thread.sleep(20000L);
  }
}