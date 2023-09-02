package org.effective.section02.item02.hierarchicalbuilder;

import static org.effective.section02.item02.hierarchicalbuilder.NyPizza.Size.SMALL;
import static org.effective.section02.item02.hierarchicalbuilder.Pizza.Topping.ONION;
import static org.effective.section02.item02.hierarchicalbuilder.Pizza.Topping.SAUSAGE;

public class PizzaTest {
  public static void main(String[] args) {

    NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE)
                                              .addTopping(ONION)
                                              .build();
    System.out.println("pizza = " + pizza);

    Calzone calzone = new Calzone.Builder().addTopping(SAUSAGE)
                                           .sauceInside()
                                           .build();
    System.out.println("calzone = " + calzone);
  }
}
