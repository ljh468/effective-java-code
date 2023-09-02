package org.effective.section02.item02.hierarchicalbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

  public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }

  final Set<Topping> toppings;

  abstract static class Builder<T extends Builder<T>> {
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    // 상위개념의 Builder를 리턴
    // public Builder<T> addTopping(Topping topping) {
    //   toppings.add(Objects.requireNonNull(topping));
    //   return this;
    // }

    // 상속받는 하위타입을 리턴
    public T addTopping(Topping topping) {
      toppings.add(Objects.requireNonNull(topping));
      return self();
    }

    abstract Pizza build();

    // 하위 클래스는 이 메서드를 재정의(overriding)하여
    // "this"를 반환하도록 해야한다.
    protected abstract T self();
  }

  Pizza(Builder<?> builder) {
    toppings = builder.toppings.clone();
  }
}