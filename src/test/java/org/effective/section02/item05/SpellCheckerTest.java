package org.effective.section02.item05;

import org.effective.section02.item05.dependencyinjection.SpellChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

  @Test
  void isValid() {
    // Assertions.assertTrue(SpellChecker.isValid("test"));

    // 가짜 Dictionary를 만들어서 사용할 수 있다.
    SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
    assertFalse(spellChecker.isValid("test"));
  }
}