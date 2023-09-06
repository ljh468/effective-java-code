package org.effective.section02.item04;

public class UtilityClass {

  /**
   * 이 클래스는 인스턴스를 만들 수 없습니다.
   */
  private UtilityClass() {
    System.out.println("constructor");
    throw new AssertionError();
  }

  public static String hello() {
    return "hello";
  }

  public static void main(String[] args) {
    System.out.println(UtilityClass.hello());

    // 인스턴스를 만들어서 static 메서드를 호출할 수 있다.
    // 그러나, 이것은 static 메서드인지 헷갈리게 하는 안좋은 코드이다.
    // UtilityClass utilityClass = new UtilityClass();
    // System.out.println(utilityClass.hello());

    // 내부 클래스에서 사용하는 것도 막으려면 AssertionError 처리를 해야함
    // UtilityClass utilityClass = new UtilityClass();
    // System.out.println("utilityClass = " + utilityClass);
  }
}
