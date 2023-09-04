package org.effective.section02.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {
  public static void main(String[] args) {
    try{
      // getDeclaredConstructor는 접근제어자에 상관없이 private 생성자에도 접근가능
      Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
      defaultConstructor.setAccessible(true);

      Elvis.INSTANCE.sing();
      Elvis elvis1 = defaultConstructor.newInstance();
      Elvis elvis2 = defaultConstructor.newInstance();
      // 다른 인스턴스가 생성됨
      System.out.println(elvis1 == elvis2);
      System.out.println(elvis1 == Elvis.INSTANCE);
    } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }
}
