package org.effective.section04.item20.templatemethod;

import java.net.URL;

public class Client {

  public static void main(String[] args) {
    URL resource = Client.class.getClassLoader().getResource("number.txt");
    FileProcessor fileProcessor = new Plus(resource.getPath());
    // System.out.println(fileProcessor.process();

    // 함수형 인터페이스를 활용해서 상속을 받지 않고 구현
    System.out.println(fileProcessor.process((a, b) -> a + b));
  }
}
