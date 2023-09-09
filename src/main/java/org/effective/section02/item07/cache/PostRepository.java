package org.effective.section02.item07.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

// 캐시는 조회할 때 마다 데이터가 계속 쌓이게 됨
public class PostRepository {

  private Map<CacheKey, Post> cache;

  public PostRepository() {
    this.cache = new HashMap<>();
    // this.cache = new WeakHashMap<>();
  }

  public Post getPostById(CacheKey key) {
    // CacheKey key = new CacheKey(id);
    if (cache.containsKey(key)) {
      return cache.get(key);
    } else {
      // TODO DB에서 읽어오거나 REST API를 통해 읽어올 수 있다.
      Post post = new Post();
      cache.put(key, post);
      return post;
    }
  }

  public Map<CacheKey, Post> getCache() {
    return cache;
  }
}
