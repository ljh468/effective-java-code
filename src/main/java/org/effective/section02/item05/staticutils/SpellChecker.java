package org.effective.section02.item05.staticutils;

import org.effective.section02.item05.DefaultDictionary;
import org.effective.section02.item05.Dictionary;

import java.util.List;

public class SpellChecker {

  // 사용하는 자원(Dictionary)에 따라 동작이 달라질 수 있어야 한다.
  // 직접 자원을 생성하면 유연하지 않고, 테스트도 작성하기 불편하다.
  private static final Dictionary dictionary = new DefaultDictionary();

  private SpellChecker() {
  }

  public static boolean isValid(String word) {
    // TODO 여기 SpellChecker 코드
    return dictionary.contains(word);
  }

  public static List<String> suggestions(String typo) {
    // TODO 여기 SpellChecker 코드
    return dictionary.closeWordsTo(typo);
  }
}
