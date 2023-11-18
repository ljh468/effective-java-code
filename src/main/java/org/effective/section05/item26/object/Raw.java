package org.effective.section05.item26.object;

import java.util.ArrayList;
import java.util.List;

// 코드 26-4 런타임에 실패한다. - unsafeAdd 메서드가 로 타입(List)을 사용 (156-157쪽)
public class Raw {
  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();
    unsafeAdd(strings, Integer.valueOf(42));

    // 컴파일러가 자동으로 형변환 코드를 넣어준다. (꺼낼때 에러)
    String s = strings.get(0);
  }

  // unsafeAdd(List<Object> list, Object o)
  private static void unsafeAdd(List list, Object o) {
    list.add(o);
  }

}