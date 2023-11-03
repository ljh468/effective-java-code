package org.effective.section04.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 코드 18-2 래퍼 클래스 - 상속 대신 컴포지션을 사용했다. (117-118쪽)
public class InstrumentedSet<E> extends ForwardingSet<E> {

  private int addCount = 0;

  public InstrumentedSet(Set<E> s) {
    super(s);
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
     * ForwardingSet의 참조된 HashSet을 사용하기 때문에 사이드 이펙트가 발생하지 않음
     * 상속으로 연결되어 있다면 allAll() 메서드를 호출할 때 상속한 오버라이딩된 add()가 호출되는데,
     * 연결이 되어있지 않기때문에 오버라이딩된 add()를 호출하지 않고 HashSet의 add만 호출하게 되는 것
     * 위임을 하므로써 연결이 약해짐 (HashSet 인터페이스의 규약만 지키면 되기때문에 캡슐화에 유이할 수 있음)
     */
    return super.addAll(c);
  }

  public int getAddCount() {
    return addCount;
  }

  public static void main(String[] args) {
    // 컴포지션은 InstrumentedSet에 HashSet을 넣어주면 됨
    InstrumentedSet<String> s = new InstrumentedSet<>(new HashSet<>());
    s.addAll(List.of("틱", "탁탁", "펑"));
    System.out.println(s.getAddCount());
  }
}
