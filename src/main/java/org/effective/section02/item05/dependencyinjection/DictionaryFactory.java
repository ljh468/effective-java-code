package org.effective.section02.item05.dependencyinjection;

import org.effective.section02.item05.DefaultDictionary;
import org.effective.section02.item05.Dictionary;

public class DictionaryFactory {

  public static Dictionary get() {
    return new DefaultDictionary();
  }
}
