package org.effective.section02.item03.enumtype;

// 열거타입으로 싱글톤을 보장
public enum Elvis {
  // 실제 private 기본생성자가 존재하지만, enum은 new 객체를 생성할 수 없게 막아둠
  INSTANCE;

  public void leaveTheBuilding() {
    System.out.println("기다려, 지금 나갈께!");
  }

  public static void main(String[] args) {
    Elvis elvis = Elvis.INSTANCE;
    elvis.leaveTheBuilding();
  }
}
