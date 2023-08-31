package org.effective.section02.item01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface HelloService {

  public String hello();

  // 외부에서도 호출
  static public String hi(){
    prepareMessage();
    return "hi";
  }

  // 인스턴스에서만 호출
  default public String bye(){
    prepareMessage();
    return "bye";
  }

  // 자바 9부터 private static 메서드 사용가능
  private static void prepareMessage(){
  }

  static HelloService of(String lang) {
    if (lang.equals("ko")) {
      return new KoreanHelloService();
    } else {
      return new EnglishHelloService();
    }
  }

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(100);
    numbers.add(20);
    numbers.add(44);
    numbers.add(3);
    System.out.println("numbers = " + numbers);

    Comparator<Integer> desc = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    };

    numbers.sort(desc);
    System.out.println("desc numbers = " + numbers);

    // 기본 메서드를 이용해서 오름차순으로 변경
    numbers.sort(desc.reversed());
    System.out.println("asc numbers = " + numbers);
  }
}
