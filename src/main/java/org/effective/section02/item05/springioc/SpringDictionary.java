package org.effective.section02.item05.springioc;

import org.effective.section02.item05.Dictionary;

import java.util.List;

public class SpringDictionary implements Dictionary {

  @Override
  public boolean contains(String word) {
    System.out.println("contains " + word);
    return false;
  }

  @Override
  public List<String> closeWordsTo(String typo) {
    return null;
  }
}
