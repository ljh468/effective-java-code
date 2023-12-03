package org.effective.section04.item24.staticmemberclass;

public class OutterClass {

  private static int number = 10;

  // 바깥 클래스에 있는 static 변수에 접근할 수 있다.
  static private class InnerClass {
    void doSomething() {
      System.out.println(number);
    }
  }

  public static void main(String[] args) {
    InnerClass innerClass = new InnerClass();
    innerClass.doSomething();

  }
}
