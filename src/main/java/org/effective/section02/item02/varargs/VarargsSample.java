package org.effective.section02.item02.varargs;

import java.util.Arrays;

public class VarargsSample {

  public void printNumbers(int... numbers) {
    System.out.println(numbers.getClass().getCanonicalName());
    System.out.println(numbers.getClass().getComponentType());
    Arrays.stream(numbers).forEach(System.out::println);
  }

  public static void main(String[] args) {
    VarargsSample varargsSample = new VarargsSample();
    varargsSample.printNumbers(5, 10);
  }
}
