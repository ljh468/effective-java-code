package org.effective.section02.item07.optional;

import java.util.Optional;

public class Chanel {

  private int numOfSubscribers;

  public Optional<MemberShip> defaultMemberShip() {
    if (this.numOfSubscribers < 2000) {
      return Optional.empty();
    } else {
      return Optional.of(new MemberShip());
    }
  }
}
