package org.effective.section02.item03.functionalinterface;

import org.effective.section02.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 기본 함수형인터페이스
public class DefaultFunctions {

  public static void main(String[] args) {
    // 매개변수를 받아서 리턴함
    Function<Integer, String> intToString = Object::toString;

    // 매개변수를 받지 않고 리턴함
    Supplier<Integer> integerSupplier;

    // 기본생성자를 통해서 객체를 생성하고 싶으면 supplier
    Supplier<Person> personSupplier = Person::new;

    // 매개변수가 있는 생성자를 통해서 객체를 생성하고 싶으면 function
    Function<LocalDate, Person> personFunction = Person::new;

    // 매개변수를 받고 리턴하지 않음
    Consumer<Integer> integerConsumer = System.out::println;

    // 매개변수를 받고 boolean 값을 리턴함
    Predicate<Integer> predicate;
  }
}
