package org.effective.section02.item03.serialization;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

  private void serialize(Book book) {
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
      out.writeObject(book);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private Book deserialize() {
    try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
      return (Book) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    Book book = new Book("12345", "이펙티브 자바 완벽 공략", "이재훈",
                         LocalDate.of(2023, 9, 6));
    book.setNumberOfSold(200);

    SerializationExample example = new SerializationExample();
    example.serialize(book);

    // static 변수는 인스턴스에 할당되는 값이 아니기 때문에 직렬화 되지 않음
    // Book.name = "jaehoon";

    Book deserializedBook = example.deserialize();

    System.out.println(book);
    System.out.println(deserializedBook);
  }
}
