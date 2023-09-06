package org.effective.section02.item03.staticfactory;

public class Elvis implements Singer {

  public static final Elvis INSTANCE = new Elvis();

  // Serializable를 구현하면 기본 생성자가 필요함
  private Elvis() {
  }

  public static Elvis getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() {
    System.out.println("I'm outta here!");
  }


  public static void main(String[] args) {
    Elvis elvis = Elvis.getInstance();
    elvis.leaveTheBuilding();

    System.out.println(Elvis.getInstance());
    System.out.println(Elvis.getInstance());
  }

  @Override
  public void sing() {
    System.out.println("my way~~~");
  }
}
