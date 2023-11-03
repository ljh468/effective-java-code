package org.effective.section04.item17.part1;

public class Person {

  // 가변 인스턴스 (가변 컴포넌트)
  private final Address address;

  public Person(Address address) {
    this.address = address;
  }

  // 가변 인스턴스에 접근을 막아야 한다. (getter X)
  public Address getAddress() {
    Address copyOfAddress = new Address();
    copyOfAddress.setZipCode(address.getZipCode());
    copyOfAddress.setStreet(address.getStreet());
    copyOfAddress.setCity(address.getCity());
    return copyOfAddress;
  }

  public static void main(String[] args) {
    // 최초의 Address는 시애틀
    Address seattle = new Address();
    seattle.setCity("Seattle");

    // Address가 Redmond로 바뀔수 있다.
    Person person = new Person(seattle);
    // Address에 접근하기를 원한다면 방어적 복사를 통해 새로운 객체를 반환
    Address redmond = person.getAddress();
    redmond.setCity("Redmond");

    System.out.println(person.address.getCity()); // Seattle
    System.out.println(redmond.getCity()); // Redmond
  }
}
