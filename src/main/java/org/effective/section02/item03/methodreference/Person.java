package org.effective.section02.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

  LocalDate birthday;

  public Person() {
  }

  public Person(LocalDate birthday) {
    this.birthday = birthday;
  }

  public int getAge() {
    return LocalDate.now().getYear() - birthday.getYear();
  }

  public static int compareByAge(Person a, Person b) {
    return a.birthday.compareTo(b.birthday);
  }

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();
    people.add(new Person(LocalDate.of(1982, 7, 15)));
    people.add(new Person(LocalDate.of(2011, 3, 2)));
    people.add(new Person(LocalDate.of(2013, 1, 28)));

    // Comparator 인터페이스의 구현체
    people.sort(new Comparator<>() {
      @Override
      public int compare(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
      }
    });

    // 람다
    Comparator<Person> personComparator = (p1, p2) -> p1.birthday.compareTo(p2.birthday);
    people.sort(personComparator);

    // 스태틱 메서드 참조
    people.sort(Person::compareByAge);

    // 인스턴스 메서드 참조
    // Person person = new Person(null);
    // people.sort(person::compareByAge);

    // 임의 객체의 인스턴스 메서드 참조
    // 매개변수가 하나, 첫번째 비교 대상은 this(자기 자신)

    // 생성자 메서드 참조
    List<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1982, 7, 15));
    dates.add(LocalDate.of(2000, 2, 1));
    dates.add(LocalDate.of(2011, 9, 23));
    List<Person> collect = dates.stream().map(Person::new).toList();
    System.out.println("collect = " + collect);
  }

}
