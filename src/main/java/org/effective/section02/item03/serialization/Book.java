package org.effective.section02.item03.serialization;

import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@ToString
public class Book implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  // public static String name;

  private String isbn;

  private String title;

  private String author;

  private LocalDate published;

  private String name;

  private transient int numberOfSold;

  public Book(String isbn, String title, String author, LocalDate published) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.published = published;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public LocalDate getPublished() {
    return published;
  }

  public void setPublished(LocalDate published) {
    this.published = published;
  }

  public int getNumberOfSold() {
    return numberOfSold;
  }

  public void setNumberOfSold(int numberOfSold) {
    this.numberOfSold = numberOfSold;
  }
}
