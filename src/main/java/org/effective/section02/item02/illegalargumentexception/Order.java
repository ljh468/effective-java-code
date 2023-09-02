package org.effective.section02.item02.illegalargumentexception;

import java.time.LocalDate;

public class Order {
  // 클라이언트에 명확한 예외를 알려주고자 할 때 개발자가 명확하게 인지하게 하기 위함
  // 가독성이 떨어져서 생략한다.
  public void updateDeliveryDate(LocalDate deliveryDate) throws IllegalArgumentException, NullPointerException {
    if (deliveryDate == null) {
      throw new NullPointerException("deliveryDate can't be null");
    }
    if (deliveryDate.isBefore(LocalDate.now())) {
      // 과거로 배송?
      throw new IllegalArgumentException("deliveryDate can't be earlier than" + LocalDate.now());
    }
  }
}
