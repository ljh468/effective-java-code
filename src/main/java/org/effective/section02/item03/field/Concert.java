package org.effective.section02.item03.field;

public class Concert {

  private boolean lightsOn;

  private boolean mainStateOpen;

  // 인터페이스 기반으로
  private IElvis elvis;

  public Concert(IElvis elvis) {
    this.elvis = elvis;
  }

  public void perform() {
    mainStateOpen = true;
    lightsOn = true;
    elvis.sing();
  }

  public boolean isLightsOn() {
    return lightsOn;
  }

  public boolean isMainStateOpen() {
    return mainStateOpen;
  }
}
