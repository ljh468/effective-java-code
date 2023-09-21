package org.effective.section02.item12;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class User {

  private final Long userId;

  private final String email;

  private final String name;

  public User(Long userId, String email, String name) {
    this.userId = userId;
    this.email = email;
    this.name = name;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
        .append("userId", userId)
        .append("email", email)
        .append("name", name)
        .toString();
  }

  public static void main(String[] args) {
    User user = new User(1L, "alsltnpf1209@gmail.com", "이재훈");
    System.out.println("user = " + user);
  }
}
