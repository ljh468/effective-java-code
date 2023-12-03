package org.effective.section04.item24.memberclass;

public class OutterClass {

  private int number = 10;

  void printNumber() {
    InnerClass innerClass = new InnerClass();
  }

  // 비정적 멤버 클래스
  private class InnerClass {
    void doSomething() {
      System.out.println(number);
      OutterClass.this.printNumber();
    }
  }

  public static void main(String[] args) {
    // 바깥 클래스 없이는 자기 자신을 생성할 수 없다.
    InnerClass innerClass = new OutterClass().new InnerClass();
    innerClass.doSomething();
  }

}
