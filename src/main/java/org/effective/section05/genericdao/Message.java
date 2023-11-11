package org.effective.section05.genericdao;

import lombok.Getter;

@Getter
public class Message implements Entity {

  private Long id;

  private String body;

  @Override
  public Long getId() {
    return id;
  }
}
