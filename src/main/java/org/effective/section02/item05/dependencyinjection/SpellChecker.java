package org.effective.section02.item05.dependencyinjection;

import org.effective.section02.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

  private final Dictionary dictionary;

  // Dictionary가 인터페이스라면?
  // 생성자를 통해 Dictionary를 주입받으면 모든 코드를 재사용할 수 있다.
  public SpellChecker(Dictionary dictionary) {
    this.dictionary = dictionary;
  }

  // 자원을 만들어주는 팩토리를 받아서 Dictionary를 주입 (팩터리 메서드 패턴)
  // 혹은 supplier를 이용
  // 혹은 한정적 와일드 카드 타입 사용 (Dictionary의 하위타입도 받을 수 있음) (인터페이스가 있으면 사용안해도 됨)
  public SpellChecker(Supplier<? extends Dictionary> dictionarySupplier) {
    this.dictionary = dictionarySupplier.get();
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
