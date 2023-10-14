package org.effective.section03.item17.part1;

import lombok.ToString;

@ToString
public class PhoneNumber {

  private int areaCode, prefix, lineNum;

  public PhoneNumber(short areaCode, short prefix, short lineNum) {
    this.areaCode = areaCode;
    this.prefix = prefix;
    this.lineNum = lineNum;
  }

  // Setter를 제공하지 않음
  public int getAreaCode() {
    return areaCode;
  }

  public int getPrefix() {
    return prefix;
  }

  public int getLineNum() {
    return lineNum;
  }
}
