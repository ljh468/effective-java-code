package org.effective.section02.item01;

public enum OrderStatus {

  PREPARING("0"),

  SHIPPED("1"),

  DELIVERING("2"),

  DELIVERED("3");

  private String code;

  OrderStatus(String code) {
    this.code = code;
  }

  public static OrderStatus get(String code) {
    for (OrderStatus element : values()) {
      if (element.code.equalsIgnoreCase(code)) {
        return element;
      }
    }
    return null;
  }
}
