package org.effective.section02.item08.autoclosable;

public class App {

  public static void main(String[] args) {
    try (AutoClosableIsGood good = new AutoClosableIsGood()) {
      // TODO 자원 반납 처리기
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
