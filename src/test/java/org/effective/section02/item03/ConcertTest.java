package org.effective.section02.item03;

import org.effective.section02.item03.field.Concert;
import org.effective.section02.item03.field.Elvis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {
  @Test
  void perform() {
    // 테스트마다 Elvis가 노래를 부르게 할 수는 없다.
    // 그래서, Mocking된 Elvis를 추가 할 수 있다.
    Concert concert = new Concert(new MockElvis());
    concert.perform();

    assertTrue(concert.isLightsOn());
    assertTrue(concert.isMainStateOpen());
  }
}