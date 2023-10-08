package org.effective.hello;

import org.effective.name.NameService;

public class HelloService {
  public static void main(String[] args) {
    NameService nameService = new NameService();
    System.out.println(nameService.getName());
    System.out.println("Hello Java Module");
  }
}