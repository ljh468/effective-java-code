package org.effective.section02.item03.field;

import java.io.*;

// 역직렬화로 여러 인스턴스 만들기
public class ElvisSerialization {

  public static void main(String[] args) {
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
      out.writeObject(Elvis.INSTANCE);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
      Elvis elvis3 = (Elvis) in.readObject();
      // 역직렬화를 할 때 새로운 인스턴스가 생성됨
      System.out.println(elvis3 == Elvis.INSTANCE);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
