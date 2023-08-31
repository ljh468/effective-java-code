package org.effective.section02.item01;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;

import static org.effective.section02.item01.OrderStatus.*;

public class Order {

  private boolean prime;

  private boolean urgent;

  private Product product;

  private OrderStatus orderStatus;

  public static Order primeOrder(Product product) {
    Order order = new Order();
    order.prime = true;
    order.product = product;
    return order;
  }

  public static Order urgentOrder(Product product) {
    Order order = new Order();
    order.urgent = true;
    order.product = product;
    return order;
  }

  public static void main(String[] args) {
    OrderStatus[] values = OrderStatus.values();
    Arrays.stream(values).forEach(System.out::println);

    Order order = new Order();
    // orderStatus가 null이어도 동작
    if (order.orderStatus == DELIVERED) {
      System.out.println("delivered");
    }

    EnumMap<OrderStatus, String> korMap = new EnumMap<>(OrderStatus.class) {
      {
        put(PREPARING, "준비중");
        put(SHIPPED, "출고완료");
        put(DELIVERING, "배송중");
        put(DELIVERED, "배송완료");
      }
    };

    EnumSet<OrderStatus> allOrderStatus = EnumSet.allOf(OrderStatus.class);
  }
}
