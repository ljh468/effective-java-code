package org.effective.section02.item08.finalizer_attack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

  @Test
  void 일반_계정() {
    Account account = new Account("jaehoon");
    account.transfer(BigDecimal.valueOf(10.4), "hello");
  }

  @Test
  void 푸틴_계정() throws InterruptedException {
    // Account account = new Account("푸틴");
    // account.transfer(BigDecimal.valueOf(10.4), "hello");

    Account account = null;
    try {
      account = new BrokenAccount("푸틴");
    } catch (RuntimeException e) {
      System.out.println("이러면???");
    }

    // gc를 수행하면 finalize 메서드가 실행된다.
    // finalize 메서드로 공격이 가능해짐
    System.gc();
    Thread.sleep(3000L);
  }
}