package org.effective.section02.item03.staticfactory;

import java.util.function.Supplier;

public class Concert {

  // supplier (매개변수를 받지 않고, 리턴값이 있는)
  public void start(Supplier<Singer> singerSupplier) {
    Singer singer = singerSupplier.get();
    singer.sing();
  }

  public static void main(String[] args) {
    Concert concert = new Concert();
    // Supplier에 준하는 메서드 참조를 추가
    concert.start(Elvis::getInstance);
  }
}
