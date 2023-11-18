package org.effective.section05.item26.genericdao;

import lombok.Getter;

@Getter
public class Account implements Entity {

  private Long id;

  private String username;

  public Account(Long id, String username) {
    this.id = id;
    this.username = username;
  }

  @Override
  public Long getId() {
    return this.id;
  }
}
