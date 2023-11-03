package org.effective.section04.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

// 코드 18-1 잘못된 예 - 상속을 잘못 사용했다! (114쪽)
public class InstrumentedHashSet<E> extends HashSet<E> {

  // 추가된 원소의 수
  private int addCount = 0;

  public InstrumentedHashSet() {
  }

  public InstrumentedHashSet(int initCap, float loadFactor) {
    super(initCap, loadFactor);
  }

  @Override
  public boolean add(E e) {
    addCount++;
    return super.add(e);
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    addCount += c.size();
    /**
     * 내부에서 add를 호출하고 있음
     * 상위클래스가 어떻게 동작하는지 알고 사용해야 함
     * 그런데 내가 모르는 상태로 상위클래스의 메서드가 바뀐다면? !!! 문제가 생김
     * --> 컴포지션을 고려해볼 수 있게됨
     */
    return super.addAll(c);
  }

  public int getAddCount() {
    return addCount;
  }

  public static void main(String[] args) {
    InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
    s.addAll(List.of("틱", "탁탁", "펑"));
    System.out.println(s.getAddCount());
  }
}
