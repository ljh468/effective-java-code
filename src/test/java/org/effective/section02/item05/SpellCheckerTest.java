package org.effective.section02.item05;

import org.effective.section02.item05.dependencyinjection.DictionaryFactory;
import org.effective.section02.item05.dependencyinjection.SpellChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

  @Test
  void isValid() {
    // Assertions.assertTrue(SpellChecker.isValid("test"));

    // 가짜 Dictionary를 만들어서 사용할 수 있다.
    // SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());

    // 자원을 만들어주는 supplier를 통해서 Dictionary를 주입
    // SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
    // SpellChecker spellChecker = new SpellChecker(DictionaryFactory::get);
    SpellChecker spellChecker = new SpellChecker(MockDictionary::new);
    assertFalse(spellChecker.isValid("test"));
  }
}