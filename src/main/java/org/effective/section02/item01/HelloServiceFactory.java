package org.effective.section02.item01;

import java.lang.reflect.Constructor;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

  public static HelloService of(String lang) {
    if (lang.equals("ko")) {
      return new KoreanHelloService();
    } else {
      return new EnglishHelloService();
    }
  }

  public static void main(String[] args) {
    // HelloService 매개변수 lang에 해당하는 구현체 가져오기
    HelloService ko = HelloService.of("ko");
    System.out.println("ko.getClass().getName() = " + ko.getClass().getName());

    // 참조된 다른 모듈에서 구현체를 가져올 수도 있다.
    // 구현체에 의존하지 않음
    ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
    Optional<HelloService> helloServiceOptional = loader.findFirst();
    helloServiceOptional.ifPresent(h -> {
      System.out.println(h.hello());
    });

    // 구현체에 의존함
    KoreanHelloService koreanHelloService = new KoreanHelloService();
    System.out.println("koreanHelloService.hello = " + koreanHelloService.hello());

    // 클래스 정보를 통해서 클래스의 필드의 값을 변경할 수 있다.
    // Class<?> aClass = Class.forName("가져올 클래스의 경로/네이밍");
    // Constructor<?> constructor = aClass.getConstructor();
    // HelloService helloService = (HelloService)constructor.newInstance();
  }
}
