package org.effective.section03.item18.callback;

public class Service {

  public void run(FunctionToCall functionToCall) {
    System.out.println("뭐 좀 하다가...");
    functionToCall.call();
  }

  public static void main(String[] args) {
    Service service = new Service();
    BobFunction bobFunction = new BobFunction(service);

    // 래퍼로 감싸고 있는 내부 객체(BobFunction)가 어떤 클래스(Service)의 콜백으로 사용되는 경우에
    // this를 전달한다면 해당 클래스(BobFunction)는 래퍼가 아닌 내부 객체를 호출한다. (SELF 문제)
    BobFunctionWrapper bobFunctionWrapper = new BobFunctionWrapper(bobFunction);
    bobFunctionWrapper.run();
  }
}
