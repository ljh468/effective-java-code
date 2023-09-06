package org.effective.section02.item05;

import java.util.List;

// 규약이 없는 클래스라면, 메서드가 다를 경우 사용하기 어렵다.
// Interface를 사용해야 재사용이 가능함
public interface Dictionary {

  boolean contains(String word);

  List<String> closeWordsTo(String typo);
}
