package org.effective.section02.item05.dependencyinjection;

import org.effective.section02.item05.Dictionary;

import java.util.List;

public class SpellChecker {

  private final Dictionary dictionary;

  // Dictionary가 인터페이스라면?
  // 생성자를 통해 Dictionary를 주입받으면 모든 코드를 재사용할 수 있다.
  public SpellChecker(Dictionary dictionary) {
    this.dictionary = dictionary;
  }

  public boolean isValid(String word) {
    // TODO 여기 SpellChecker 코드
    return dictionary.contains(word);
  }

  public List<String> suggestions(String typo) {
    // TODO 여기 SpellChecker 코드
    return dictionary.closeWordsTo(typo);
  }
}
