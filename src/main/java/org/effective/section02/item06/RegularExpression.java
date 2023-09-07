package org.effective.section02.item06;

import java.util.regex.Pattern;

public class RegularExpression {

  private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

  public static void main(String[] args) {
    long start = System.nanoTime();
    for (int j = 0; j < 10000; j++) {
      String name = "jaehoon,whiteship";
      name.split(","); // 문자 1개는 성능상 차이가 없다.
      // SPLIT_PATTERN.split(name);

      name.replaceAll(",", name);
      SPLIT_PATTERN.matcher(name).replaceAll("");
    }
    System.out.println(System.nanoTime() - start);
  }
}
