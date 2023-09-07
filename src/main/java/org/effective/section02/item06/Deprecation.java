package org.effective.section02.item06;

public class Deprecation {
  // name을 받는 생성자만 유저하고 싶다면, @Deprecated (경고 메시지)
  // TODO 애노테이션 프로세서 (컴파일 시점에 애노테이션을 처리하는 녀석)

  /**
   * @deprecated in favor of
   * {@link #Deprecation(String)}
   */
  @Deprecated(forRemoval = true, since = "1.2")
  public Deprecation() {
  }

  private String name;

  public Deprecation(String name) {
    this.name = name;
  }
}
