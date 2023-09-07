package org.effective.section02.item05.springioc;

import org.effective.section02.item05.Dictionary;

public class App {
  public static void main(String[] args) {
    /**
     * pojo로 만들어진 SpellChecker는 그대로 유지하면서
     * Spring Bean으로 등록된 객체를 가져옴, 쓰기만 하면 됨
     */

    // ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    // SpellChecker spellChecker = applicationContext.getBean(SpellChecker.class);
    // spellChecker.isValid("test");
  }
}
