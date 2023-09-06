package org.effective.section02.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

  /**
   * 싱글톤 오브젝트
   * javadoc을 만들 때 주석을 활용할 수 있다.
   */
  public static final Elvis INSTANCE = new Elvis();
  // 필드에 직접 접근하여 싱글톤을 보장

  private static boolean created;

  // Serializable를 구현하면 기본 생성자가 필요함
  private Elvis() {
    if (created) {
      throw new UnsupportedOperationException("can't be created by constructor");
    }
    created = true;
  }

  // 정적팩터리 메서드 (메서드를 통해서 접근)
  // 필드에 직접 접근하는 것 처럼 1. 테스트 2. 리플렉션 3. 직렬화,역직렬화의 3가지 단점 동일
  public static Elvis getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() {
    System.out.println("I'm outta here!");
  }

  public void sing() {
    System.out.println("I'll have a blue. christmas without you");
  }

  public static void main(String[] args) {
    Elvis elvis = Elvis.INSTANCE;
    elvis.leaveTheBuilding();
  }

  // 역직렬화를 할 때 사용됨 (override가 아니지만 똑같이 동작)
  private Object readResolve() {
    return INSTANCE;
  }
}
