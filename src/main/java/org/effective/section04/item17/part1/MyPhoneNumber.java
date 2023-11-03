package org.effective.section04.item17.part1;

import lombok.ToString;

@ToString
public class MyPhoneNumber extends PhoneNumber {

  public MyPhoneNumber(short areaCode, short prefix, short lineNum) {
    super(areaCode, prefix, lineNum);
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
