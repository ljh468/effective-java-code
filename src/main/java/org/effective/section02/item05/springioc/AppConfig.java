package org.effective.section02.item05.springioc;

import org.effective.section02.item05.Dictionary;

// @Configuration
public class AppConfig {

  // @Bean
  public SpellChecker spellChecker(Dictionary dictionary) {
    return new SpellChecker(dictionary);
  }

  // @Bean
  public Dictionary dictionary() {
    return new SpringDictionary();
  }
}
