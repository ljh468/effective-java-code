package org.effective.section02.item03.enumtype;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumElvisReflection {
  public static void main(String[] args) {
    try{
      Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
      System.out.println(declaredConstructor);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
