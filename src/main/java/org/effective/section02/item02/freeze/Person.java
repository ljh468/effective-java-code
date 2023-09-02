package org.effective.section02.item02.freeze;

import java.util.ArrayList;
import java.util.List;

public class Person {

  private String name;

  private  int birth;

  private List<String> kids;

  public Person(String name, int birth) {
    this.name = name;
    this.birth = birth;
    this.kids = new ArrayList<>();
  }

  // public void setName(String name) {
  //   checkIfObjectIsFrozen();
  //   this.name = name;
  // }

  // private void checkIfObjectIsFrozen() {
  //   if (this.frozen()) {
  //     throw new IllegalStateException();
  //   }
  // }

  public void setBirth(int birth) {
    this.birth = birth;
  }

  public void setKids(List<String> kids) {
    this.kids = kids;
  }

  public static void main(String[] args) {
    // final이기 때문에 값을 변경할 수 없다.
    final Person person = new Person("jaehoon", 99);
    // person.name = "whitship ";
  }
}
