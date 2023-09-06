package org.effective.section02.item03.functionalinterface;

@FunctionalInterface
public interface MyFunction {

  // 메서드 선언은 1개만 있어야 함
  // 기본 함수형인터페이스로 타입을 지정할 수 없는 경우 직접 정의할 수 있음
  String valueOf(Integer integer);

  static String hello() {
    return "hello";
  }
}
