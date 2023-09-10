package org.effective.section02.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ChanelTest {

  @Test
  void npe() {
    Chanel chanel = new Chanel();
    Optional<MemberShip> optional = chanel.defaultMemberShip();
    optional.ifPresent(MemberShip::hello);
  }
}