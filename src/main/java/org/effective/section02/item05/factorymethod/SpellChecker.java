package org.effective.section02.item05.factorymethod;

import org.effective.section02.item05.Dictionary;

import java.util.List;

public class SpellChecker {

  private Dictionary dictionary;

  private SpellChecker(DictionaryFactory dictionaryFactory) {
    this.dictionary = dictionaryFactory.getDictionary();
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