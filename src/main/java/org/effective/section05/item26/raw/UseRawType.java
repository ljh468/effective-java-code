package org.effective.section05.item26.raw;

public class UseRawType<E> {

  private E e;

  public static void main(String[] args) {

    // 클래스에 매개변수 타입을 넣을 수 없다. (타입이 소거 되기 때문)
    // System.out.println(UseRawType<Integer>.class);
    System.out.println(UseRawType.class);

    UseRawType<String> stringType = new UseRawType<>();

    // 사용할 수 있지만, 어차피 소거됨
    // System.out.println(stringType instanceof UseRawType<String>);
    System.out.println(stringType instanceof UseRawType);
  }
}