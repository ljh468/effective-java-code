package org.effective.section02.item08.outerclass;

import java.lang.reflect.Field;

// 중첩 클래스
public class OuterClass {

  private void hi() {
    System.out.println("hi");
  }

  // static이 아님 (OuterClass를 거쳐야 함)
  class InnerClass{
    public void hello() {
      // InnerClass에서 OuterClass를 참조하는 방법
      OuterClass.this.hi();
      System.out.println("hello");
    }
  }

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    InnerClass innerClass = outerClass.new InnerClass();
    System.out.println(innerClass);

    outerClass.printField();
  }

  private void printField() {
    Field[] declaredFields = InnerClass.class.getDeclaredFields();
    for (Field field : declaredFields) {
      System.out.println("field type : " + field.getType());
      System.out.println("field name : " + field.getName());
    }
  }
}
