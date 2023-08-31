package org.effective.section02.item01.flyweight;

public class Character {

  private char value;

  private String color;

  private Font font;

  public Character(char value, String color, Font font) {
    this.value = value;
    this.color = color;
    this.font = font;
  }
}
