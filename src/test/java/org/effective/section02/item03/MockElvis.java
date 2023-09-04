package org.effective.section02.item03;

import org.effective.section02.item03.field.IElvis;

public class MockElvis implements IElvis {
  @Override
  public void leaveTheBuilding() {
  }

  @Override
  public void sing() {
    System.out.println("you ain't nothing' but a hound dog.");
  }
}
