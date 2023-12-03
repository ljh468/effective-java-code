package org.effective.section04.item22.constantinterface;

public class MyClass implements PhysicalConstants {

  public static void main(String[] args) {
    // 인터페이스는 타입을 정의하는 용도
    System.out.println(BOLTZMANN_CONSTANT);
    PhysicalConstants myClass = new MyClass(); // ?
  }

}
