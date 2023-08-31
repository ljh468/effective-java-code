package org.effective.section02.item01;

import java.util.ArrayList;
import java.util.List;

public class Settings {

  private boolean useAutoSteering;

  private boolean useABS;

  private Difficulty difficulty;

  private Settings() {
  }

  private static final Settings SETTINGS = new Settings();

  public static Settings newInstance() {
    return SETTINGS;
  }

  public static void main(String[] args) {
    // ArrayList의 처럼 기본생성자를 열어두는 경우도 있다.
    // 기본생성자
    List<String> list = new ArrayList<>();
    // 정적 팩터리 메서드
    List.of("keesun", "whiteship");
  }
}
