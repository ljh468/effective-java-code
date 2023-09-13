package org.effective.section02.item09.suppress;

import java.io.*;

public class TopLine {
  // 코드 9-1 try-finally - 더 이상 자원을 회수하는 최선의 방책이 아니다! (47쪽)
  static String firstLineOfFile(String path) throws IOException {
    // try(BufferedReader br = new BadBufferedReader(new FileReader(path))) {
    try (BufferedReader br = new BadBufferedReader(new InputStreamReader(TopLine.class.getClassLoader().getResourceAsStream(path)))) {
      // 예외가 2개 발생하는 경우는 마지막 예외만 보임 (예외를 잡아먹게 되는 문제를 방지)
      return br.readLine();
    }
  }

  public static void main(String[] args) throws IOException {
    System.out.println(firstLineOfFile("test.txt"));
  }
}
