package org.effective.section04.item18.callback;

public class BobFunctionWrapper implements FunctionToCall {

  private final BobFunction bobFunction;

  public BobFunctionWrapper(BobFunction bobFunction) {
    this.bobFunction = bobFunction;
  }

  @Override
  public void call() {
    // bobFunction에 위임
    this.bobFunction.call();
    System.out.println("커피도 마실까...");
  }

  @Override
  public void run() {
    // bobFunction에 위임
    this.bobFunction.run();
  }
}
