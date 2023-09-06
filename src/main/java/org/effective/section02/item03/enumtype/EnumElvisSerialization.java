package org.effective.section02.item03.enumtype;

import org.effective.section02.item03.field.Elvis;

import java.io.*;

public class EnumElvisSerialization {

  public static void main(String[] args) {
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
      out.writeObject(Elvis.INSTANCE);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
      Elvis elvis3 = (Elvis) in.readObject();
      // enum은 역직렬화하면 동일한 인스턴스를 반환
      System.out.println(elvis3 == Elvis.INSTANCE);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
