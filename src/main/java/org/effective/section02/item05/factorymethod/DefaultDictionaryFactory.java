package org.effective.section02.item05.factorymethod;

import org.effective.section02.item05.DefaultDictionary;
import org.effective.section02.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory{

  @Override
  public Dictionary getDictionary() {
    return new DefaultDictionary();
  }
}