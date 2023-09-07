package org.effective.section02.item06;

public class Strings {

  public static void main(String[] args) {
    // JVM은
    String hello = "hello";
    String hello2 = new String("hello");
    String hello3 = "hello";

    System.out.println(hello == hello2);
    // 문자열 비교는 동등성 비교
    System.out.println(hello.equals(hello2));
    // 같은 리터럴이기 때문에 동일함
    System.out.println(hello == hello3);
  }
}
